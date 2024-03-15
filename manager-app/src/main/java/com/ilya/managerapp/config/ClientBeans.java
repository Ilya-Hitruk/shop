package com.ilya.managerapp.config;

import com.ilya.managerapp.client.RestClientProductsRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientBeans {

    @Bean
    public RestClientProductsRestClient productsRestClient(@Value("${shop.services.catalog.uri:http://localhost:8081}") String catalogBaseUri) {
        return new RestClientProductsRestClient(RestClient.builder()
                .baseUrl(catalogBaseUri)
                .build());
    }
}
