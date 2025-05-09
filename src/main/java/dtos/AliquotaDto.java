package dtos;

public record AliquotaDto(long impostoId, String ufOrigem, String ufDestino,
                          String municipioDestino, String tipoOperacao,
                          String categoria, double percentual) {
}
