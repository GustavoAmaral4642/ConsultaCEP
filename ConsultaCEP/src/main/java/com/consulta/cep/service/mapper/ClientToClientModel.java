package com.consulta.cep.service.mapper;

import com.consulta.cep.service.model.ClientModel;
import com.consulta.cep.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientToClientModel {
    public static List<ClientModel> map(List<Client> clients) {

        List<ClientModel> clientModels = new ArrayList<>();

        clients.forEach(client -> {
            ClientModel cl = ClientModel.builder()
                    .id(client.getId())
                    .name(client.getName())
                    .adresses(client.getAdresses().stream().map(AddressToAddressModel::map).collect(Collectors.toList()))
                            .build();
            clientModels.add(cl);
        });

        return clientModels;
    }

    public static ClientModel mapClient(Client client){
        return ClientModel.builder()
                .id(client.getId())
                .name(client.getName())
                .adresses(client.getAdresses().stream().map(AddressToAddressModel::map).collect(Collectors.toList()))
                .build();
    }
}
