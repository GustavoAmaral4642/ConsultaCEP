package com.consulta.cep.front.service;

import com.consulta.cep.front.model.ClientModel;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    private final WebClient webClient;

    public ClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public ClientModel saveClient(ClientModel client) {
        return this.webClient.post().uri("/clients").body(Mono.just(client), ClientModel.class).retrieve().bodyToMono(ClientModel.class).block();
    }
}
