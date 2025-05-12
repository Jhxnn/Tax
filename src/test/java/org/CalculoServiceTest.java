package org;

import dtos.CalculoICMSDto;
import dtos.CalculoIPIDto;
import dtos.CalculoISSDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import services.AliquotaService;
import services.CalculoService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculoServiceTest {

    @InjectMocks
    private CalculoService calculoService;

    @Mock
    private AliquotaService aliquotaService;


    @Test
    void testCalcularICMS() {
        CalculoICMSDto dto = new CalculoICMSDto("SP", "SC", "VENDA", "eletronico", 1000);
        when(aliquotaService.retornarPercentualICSM(dto)).thenReturn(17.0);
        double percentual = aliquotaService.retornarPercentualICSM(dto) / 100;
        assertEquals(170.0, dto.valorProduto() * percentual, 0.01);
    }

    @Test
    void testCalcularIPI() {
        CalculoIPIDto dto = new CalculoIPIDto("VENDA", "eletronico", 1000);
        when(aliquotaService.retornarPercentualIPI(dto)).thenReturn(15.0);
        double percentual = aliquotaService.retornarPercentualIPI(dto) / 100;
        assertEquals(150.0, dto.valorProduto() * percentual, 0.01);

    }

    @Test
    void testCalcularISS() {
        CalculoISSDto dto = new CalculoISSDto("Joinville", "SERVICO", "tecnologia", 1000);
        when(aliquotaService.retornarPercentualISS(dto)).thenReturn(2.5);
        double percentual = aliquotaService.retornarPercentualISS(dto) / 100;
        assertEquals(25.0, dto.valorServico() * percentual, 0.01);
    }



}
