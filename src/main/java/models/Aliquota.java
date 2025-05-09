package models;

import jakarta.persistence.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "aliquotas")
public class Aliquota extends PanacheEntityBase{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aliquotaId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name ="imposto_id")
    public Imposto imposto;

    @Column(name = "uf_origem")
    public String ufOrigem;

    @Column(name = "uf_destino")
    public String ufDestino;

    @Column(name = "municipio_destino")
    public String municipioDestino;

    @Column(name = "tipo_operacao")
    public String tipoOperacao;

    public String categoria;

    private double percentual;





    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }



    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
    }

    public String getUfDestino() {
        return ufDestino;
    }

    public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
    }

    public String getMunicipioDestino() {
        return municipioDestino;
    }

    public void setMunicipioDestino(String municipioDestino) {
        this.municipioDestino = municipioDestino;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
