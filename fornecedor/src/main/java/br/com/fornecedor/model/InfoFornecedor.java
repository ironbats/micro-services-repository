package br.com.fornecedor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InfoFornecedor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private Integer numero;
    private String estado;


    public void setId(Long id) {
        this.id = id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }
}
