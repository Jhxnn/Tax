package services;


import dtos.AliquotaDto;
import dtos.ImpostoDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import models.Aliquota;
import models.Imposto;
import repositories.AliquotaRepository;
import repositories.ImpostoRepository;

import java.util.List;

@ApplicationScoped
public class ImpostoService {

    @Inject
    ImpostoRepository impostoRepository;

    public List<Imposto> findAll(){
        return impostoRepository.listAll();
    }
    public Imposto findById(long id){
        return impostoRepository.findById(id);
    }
    public Imposto createImposto(ImpostoDto impostoDto){
        Imposto imposto = new Imposto();
        imposto.setDescricao(impostoDto.descricao());
        imposto.setNome(impostoDto.nome());
        impostoRepository.persist(imposto);
        return imposto;
    }
}
