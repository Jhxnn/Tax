package org;

import dtos.CalculoICMSDto;
import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.restassured.internal.RestAssuredResponseOptionsImpl;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import services.AliquotaService;
import services.CalculoService;

import static io.restassured.RestAssured.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@QuarkusIntegrationTest
class CalculoServiceTest {

    @Inject
    AliquotaService aliquotaService;

    @Inject
    CalculoService calculoService;

    @Test
    void testCalcularICMS() {
        when(aliquotaService.retornarPercentualICSM(any(CalculoICMSDto.class))).thenReturn(18.0);
        double resultado = calculoService.calcularICMS();
        assertEquals(180.0, resultado);
    }



}
