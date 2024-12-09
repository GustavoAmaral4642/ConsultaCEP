package com.consulta.cep.integration;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class FindCepImpl implements FindCep{

    private final WebClient webClient;

    private final String URL = "https://viacep.com.br/ws/";

    private final String JSON = "/json/";

    private final String ENDPOINT_MOCKOON = "http://localhost:3000/cep/";

    public FindCepImpl(WebClient.Builder webClientBuilder) {
//        this.webClient = webClientBuilder.baseUrl(URL).build();
        this.webClient = webClientBuilder.baseUrl(ENDPOINT_MOCKOON).build();
    }

    @Override
    public String find(String cep){
//        String str = this.webClient.get().uri(cep + JSON).retrieve().bodyToMono(String.class).block();
        String str = this.webClient.get().uri(cep).retrieve().bodyToMono(String.class).block();
        return str;
    }
}
