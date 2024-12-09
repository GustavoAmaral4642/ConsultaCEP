package com.consulta.cep.service.impl;

import com.consulta.cep.domain.Address;
import com.consulta.cep.domain.Client;
import com.consulta.cep.repository.AddressRepository;
import com.consulta.cep.repository.ClientRepository;
import com.consulta.cep.service.ClientService;
import com.consulta.cep.service.mapper.ClientToClientModel;

import com.consulta.cep.service.model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<ClientModel> getAllClients() {
        try {
            List<Client> clients = clientRepository.findAll();
            return ClientToClientModel.mapListClients(clients);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClientModel save(Client client) {
        try {
            // Salva o cliente primeiro
            Client savedClient = clientRepository.save(client);

            // Associa o cliente salvo a cada endereço e salva os endereços
            // necessario para não dar TransientPropertyValueException
            for (Address address : savedClient.getAddresses()) {
                address.setClient(savedClient); addressRepository.save(address);
            }
            return ClientToClientModel.mapClient(savedClient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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
