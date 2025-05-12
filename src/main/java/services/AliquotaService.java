package services;

import dtos.AliquotaDto;
import dtos.CalculoICMSDto;
import dtos.CalculoIPIDto;
import dtos.CalculoISSDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import models.Aliquota;
import models.Imposto;
import repositories.AliquotaRepository;

import java.util.List;

@ApplicationScoped
public class AliquotaService {

    @Inject
    AliquotaRepository aliquotaRepository;

    @Inject
    ImpostoService impostoService;

    public List<Aliquota> findAll(){
        return aliquotaRepository.listAll();
    }
    public Aliquota findById(long id){
        return aliquotaRepository.findById(id);
    }
    public Aliquota createAliquota(AliquotaDto aliquotaDto){
        Aliquota aliquota = new Aliquota();
        Imposto imposto = impostoService.findById(aliquotaDto.impostoId());
        aliquota.setTipoOperacao(aliquotaDto.tipoOperacao());
        aliquota.setUfOrigem(aliquotaDto.ufOrigem());
        aliquota.setUfDestino(aliquotaDto.ufDestino());
        aliquota.setPercentual(aliquotaDto.percentual());
        aliquota.setMunicipioDestino(aliquotaDto.municipioDestino());
        aliquota.setCategoria(aliquotaDto.categoria());
        aliquota.setImposto(imposto);
        aliquotaRepository.persist(aliquota);
        return aliquota;
    }
    public Aliquota updateAliquota(long id, AliquotaDto aliquotaDto){
        Aliquota aliquota = findById(id);
        Imposto imposto = impostoService.findById(aliquotaDto.impostoId());
        if(aliquotaDto.impostoId() != 0){
             aliquota.setImposto(imposto);
        }
        if(aliquotaDto.categoria() != null){
            aliquota.setCategoria(aliquotaDto.categoria());
        }
        if(aliquotaDto.municipioDestino() != null){
            aliquota.setMunicipioDestino(aliquotaDto.municipioDestino());
        }
        if(aliquotaDto.percentual() != 0){
            aliquota.setPercentual(aliquotaDto.percentual());
        }
        if(aliquotaDto.ufDestino() != null){
            aliquota.setUfDestino(aliquotaDto.ufDestino());
        }
        if(aliquotaDto.ufOrigem() != null){
            aliquota.setUfOrigem(aliquotaDto.ufOrigem());
        }
        if(aliquotaDto.tipoOperacao() != null){
            aliquota.setTipoOperacao(aliquotaDto.tipoOperacao());
        }
        aliquotaRepository.persist(aliquota);
        return aliquota;
    }

    public double retornarPercentualIPI(CalculoIPIDto calculoIPIDto){
        Aliquota aliquota = aliquotaRepository.buscarIpi(calculoIPIDto.tipoOperacao(), calculoIPIDto.categoria());
        if (aliquota == null) {
            throw new IllegalArgumentException("Alíquota IPI não encontrada para os parâmetros informados.");
        }
        return  aliquota.getPercentual();
    }

    public double retornarPercentualICSM(CalculoICMSDto calculoICMSDto){
        Aliquota aliquota = aliquotaRepository.buscarIcms(calculoICMSDto.ufOrigem(), calculoICMSDto.ufDestino(), calculoICMSDto.tipoOperacao(), calculoICMSDto.categoria());
        if (aliquota == null) {
            throw new IllegalArgumentException("Alíquota ICMS não encontrada para os parâmetros informados.");
        }
        return  aliquota.getPercentual();
    }

    public double retornarPercentualISS(CalculoISSDto calculoISSDto){
        Aliquota aliquota = aliquotaRepository.buscarIss(calculoISSDto.municipioDestino(), calculoISSDto.tipoOperacao(), calculoISSDto.categoria());
        if (aliquota == null) {
            throw new IllegalArgumentException("Alíquota ISS não encontrada para os parâmetros informados.");
        }
        return  aliquota.getPercentual();
    }

}
