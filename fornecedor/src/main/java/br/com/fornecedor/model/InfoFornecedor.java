package br.com.fornecedor.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class InfoFornecedor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private Integer numero;
    private String estado;

    //um fornecedor para muitos pedidos
    //ou seja um fornecedor pode ter muitos pedidos ou fazer muitos pedidos
    @OneToMany(targetEntity = Pedido.class,mappedBy = "infoFornecedor")
    private Set<Pedido> pedido  = new HashSet<>();

    public void setPedido(Set<Pedido> pedido) {
        this.pedido = pedido;
    }

    public Set<Pedido> getPedido() {
        return pedido;
    }

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
