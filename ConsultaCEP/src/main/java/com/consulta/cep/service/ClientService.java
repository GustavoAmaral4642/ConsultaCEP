package com.consulta.cep.service;

import com.consulta.cep.domain.Client;
import com.consulta.cep.service.model.ClientModel;

import java.util.List;

public interface ClientService {

    List<ClientModel> getAllClients();

    Client get(Long id);

    ClientModel save(Client client);

    void update(Client client);

    void delete(Long id);
}
