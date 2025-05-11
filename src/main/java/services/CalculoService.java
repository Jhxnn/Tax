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


    public double calcularICMS(CalculoICMSDto calculoICMSDto, double valorProduto){
        double percentual = aliquotaService.retornarPercentualICSM(calculoICMSDto) / 100;
        return  valorProduto * percentual;

    }
    public double calcularIPI(CalculoIPIDto calculoIPIDto, double valoProduto){
        double percentual = aliquotaService.retornarPercentualIPI(calculoIPIDto) / 100;
        return valoProduto * percentual;
    }
    public double calcularISS(CalculoISSDto calculoISSDto, double valorServico){
        double percentual = aliquotaService.retornarPercentualISS(calculoISSDto) / 100;
        return valorServico * percentual;
    }



}
