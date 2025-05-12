package services;

import dtos.CalculoICMSDto;
import dtos.CalculoIPIDto;
import dtos.CalculoISSDto;
import dtos.ResponseDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CalculoService {

    @Inject
    AliquotaService aliquotaService;

    @Inject
    ImpostoService impostoService;


    public ResponseDto calcularICMS(CalculoICMSDto calculoICMSDto){
        double percentual = aliquotaService.retornarPercentualICSM(calculoICMSDto) / 100;
        return new ResponseDto(calculoICMSDto.valorProduto() * percentual, percentual);

    }
    public ResponseDto calcularIPI(CalculoIPIDto calculoIPIDto){
        double percentual = aliquotaService.retornarPercentualIPI(calculoIPIDto) / 100;
        return new ResponseDto(calculoIPIDto.valorProduto() * percentual, percentual);
    }
    public ResponseDto calcularISS(CalculoISSDto calculoISSDto){
        double percentual = aliquotaService.retornarPercentualISS(calculoISSDto) / 100;
        return new ResponseDto(calculoISSDto.valorServico() * percentual, percentual);
    }



}
