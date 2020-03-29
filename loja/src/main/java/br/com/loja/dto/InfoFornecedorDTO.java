package br.com.loja.dto;

public class InfoFornecedorDTO {

    private String rua;
    private Integer numero;
    private String estado;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "InfoFornecedorDTO{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", estado='" + estado + '\'' +
                '}';
    }
}
