package repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import models.Aliquota;

@ApplicationScoped
public class AliquotaRepository implements PanacheRepository<Aliquota> {
    public Aliquota buscarIcms(String ufOrigem, String ufDestino, String tipoOperacao, String categoria) {
        return find("imposto.nome = ?1 and ufOrigem = ?2 and ufDestino = ?3 and tipoOperacao = ?4 and categoria = ?5",
                "ICMS", ufOrigem, ufDestino, tipoOperacao, categoria).firstResult();
    }

    public Aliquota buscarIpi(String tipoOperacao, String categoria) {
        return find("imposto.nome = ?1 and tipoOperacao = ?2 and categoria = ?3",
                "IPI", tipoOperacao, categoria).firstResult();
    }

    public Aliquota buscarIss(String municipioDestino, String tipoOperacao, String categoria) {
        return find("imposto.nome = ?1 and municipioDestino = ?2 and tipoOperacao = ?3 and categoria = ?4",
                "ISS", municipioDestino, tipoOperacao, categoria).firstResult();
    }




}
