package services;

import dtos.CalculoICMSDto;
import dtos.CalculoIPIDto;
import dtos.CalculoISSDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CalculoService {

    @Inject
    AliquotaService aliquotaService;

    @Inject
    ImpostoService impostoService;


    public double calcularICMS(CalculoICMSDto calculoICMSDto){
        double percentual = aliquotaService.retornarPercentualICSM(calculoICMSDto) / 100;
        return  calculoICMSDto.valorProduto() * percentual;

    }
    public double calcularIPI(CalculoIPIDto calculoIPIDto){
        double percentual = aliquotaService.retornarPercentualIPI(calculoIPIDto) / 100;
        return calculoIPIDto.valorProduto() * percentual;
    }
    public double calcularISS(CalculoISSDto calculoISSDto){
        double percentual = aliquotaService.retornarPercentualISS(calculoISSDto) / 100;
        return calculoISSDto.valorServico() * percentual;
    }



}
