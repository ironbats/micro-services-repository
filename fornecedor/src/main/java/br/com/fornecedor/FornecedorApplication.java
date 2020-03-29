package br.com.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories
@ComponentScan(value = {"br.com.fornecedor.controller",
		"br.com.fornecedor.service",
		"br.com.fornecedor.repository"})
public class FornecedorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FornecedorApplication.class, args);
	}

}
