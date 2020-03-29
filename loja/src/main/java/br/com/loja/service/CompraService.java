package br.com.loja.service;

import br.com.loja.dto.CompraDTO;
import br.com.loja.dto.InfoPedidoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
@Slf4j
public class CompraService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient eurekaClient;
    @Autowired
    private FornecedorClient fornecedorClient;

    public void informacoesFornecedor(CompraDTO compraDTO) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String  json   =    objectMapper.writeValueAsString(fornecedorClient.getInfoPorEstado(compraDTO.getEndereco().getEstado()));
            log.info(json);
        } catch (JsonProcessingException e) {
            log.info("exception during conversion json  " +e.getMessage());
        }

    }

    public void realizaPedido(ItensPedidoDTO itensPedidoDTO){

              InfoPedidoDTO info = fornecedorClient.realizarPedido(Arrays.asList(itensPedidoDTO));
              log.info("info pedido  " + info);
    }
}
