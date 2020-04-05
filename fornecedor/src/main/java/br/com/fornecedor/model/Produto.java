package br.com.fornecedor.model;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String codigoProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private String tipoProduto;
    private String corProduto;
    private Double precoProduto;
    private Integer quantidade;

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Long getId() {
        return id;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }
}
