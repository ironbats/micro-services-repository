package br.com.fornecedor.service;

import br.com.fornecedor.dto.ItensPedidoDTO;
import br.com.fornecedor.model.InfoFornecedor;
import br.com.fornecedor.model.Pedido;
import br.com.fornecedor.model.Produto;
import br.com.fornecedor.repository.InfoRepository;
import br.com.fornecedor.repository.PedidoRepository;
import br.com.fornecedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DefaultInfoServiceImpl implements InfoFornecedorService {

    @Autowired
    private InfoRepository infoRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public InfoFornecedor getInfoPorEstado(String estado) {


        realizaPedido(null);

        return null;
    }

    @Override
    public void realizaPedido(List<ItensPedidoDTO> pedidos) {


        Pedido pedido = new Pedido();
        pedido.setCodigoPedido("codigo1");


        Produto produto = new Produto();
        produto.setCodigoProduto("123");
        produto.setCorProduto("teste");
        produto.setDescricaoProduto("produto teste");
        produto.setQuantidade(12);

        produtoRepository.save(produto);

        //pedidoRepository.save(pedido);

    }
}
