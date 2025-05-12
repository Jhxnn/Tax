package dtos;

import models.Aliquota;

public record CalculoICMSDto(String ufOrigem, String ufDestino, String tipoOperacao, String categoria, double valorProduto) {
}
