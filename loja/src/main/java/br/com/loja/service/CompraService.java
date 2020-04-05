package br.com.loja.service;

import br.com.loja.dto.CompraDTO;
import br.com.loja.dto.InfoPedidoDTO;
import br.com.loja.dto.ResponseStatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class CompraService {

    @Autowired
    private DiscoveryClient eurekaClient;
    @Autowired
    private FornecedorClient fornecedorClient;


    @HystrixCommand(fallbackMethod = "informacoesdoFornecedores",threadPoolKey = "threadPoolCompraKey")
    public void informacoesFornecedor(CompraDTO compraDTO) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(fornecedorClient.getInfoPorEstado(compraDTO.getEndereco().getEstado()));
            log.info(json);
        } catch (JsonProcessingException e) {
            log.info("exception during conversion json  " + e.getMessage());
        }

    }

    public ResponseStatus informacoesdoFornecedores() {
        CompraDTO compraDTO = new CompraDTO();
        compraDTO.setResponseStatus(new ResponseStatus("Problem to send Information",
                HttpStatus.BAD_REQUEST, "error no envio "));

        return compraDTO.getResponseStatus();


    }

    public void realizaPedido(ItensPedidoDTO itensPedidoDTO) {

        InfoPedidoDTO info = fornecedorClient.realizarPedido(Arrays.asList(itensPedidoDTO));
        log.info("info pedido  " + info);
    }
}
