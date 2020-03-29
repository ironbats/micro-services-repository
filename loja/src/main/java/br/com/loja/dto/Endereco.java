package br.com.loja.dto;

public class Endereco {

    private String rua;
    private Integer numero;
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public String getRua() {
        return rua;
    }
}
