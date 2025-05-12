package org;
import dtos.CalculoICMSDto;
import dtos.CalculoIPIDto;
import dtos.CalculoISSDto;
import models.Aliquota;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repositories.AliquotaRepository;
import services.AliquotaService;
import services.ImpostoService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AliquotaServiceTest {

    @InjectMocks
    private AliquotaService aliquotaService;

    @Mock
    private AliquotaRepository aliquotaRepository;

    @Test
    void testRetornarPercentualICSM() {

        CalculoICMSDto dto = new CalculoICMSDto("SP", "SC", "VENDA", "eletronico",1000);
        Aliquota aliquota = new Aliquota();
        aliquota.setPercentual(17.0);

        when(aliquotaRepository.buscarIcms("SP", "SC", "VENDA", "eletronico")).thenReturn(aliquota);

        double percentual = aliquotaService.retornarPercentualICSM(dto);

        assertEquals(17.0, percentual);
    }

    @Test
    void testRetornarPercentualIPI(){
        CalculoIPIDto dto = new CalculoIPIDto("VENDA", "eletronico",1000);
        Aliquota aliquota = new Aliquota();
        aliquota.setPercentual(15.0);

        when(aliquotaRepository.buscarIpi("VENDA", "eletronico")).thenReturn(aliquota);

        double percentual = aliquotaService.retornarPercentualIPI(dto);

        assertEquals(15.0, percentual);
    }
    @Test
    void testRetornarPercentualISS(){
        CalculoISSDto dto = new CalculoISSDto("Joinville","VENDA", "tecnologia",1000);
        Aliquota aliquota = new Aliquota();
        aliquota.setPercentual(2.5);

        when(aliquotaRepository.buscarIss("Joinville","VENDA", "tecnologia")).thenReturn(aliquota);

        double percentual = aliquotaService.retornarPercentualISS(dto);

        assertEquals(2.5, percentual);
    }

}
