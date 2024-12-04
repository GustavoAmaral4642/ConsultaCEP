package com.consulta.cep.service.impl;

import com.consulta.cep.domain.Client;
import com.consulta.cep.repository.ClientRepository;
import com.consulta.cep.service.ClientService;
import com.consulta.cep.service.mapper.ClientToClientModel;
import com.consulta.cep.service.model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<ClientModel> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return ClientToClientModel.map(clients);
    }

    @Override
    public ClientModel save(Client client) {
        ClientModel clientModel = ClientToClientModel.mapClient(clientRepository.save(client));
        return clientModel;
    }

    @Override
    public Client get(Long id) {
        return null;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Long id) {

    }
}
