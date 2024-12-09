package com.consulta.cep.service.helper;

import com.consulta.cep.domain.Address;
import com.consulta.cep.domain.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientHelper {

    public Client prepareEntitySave(Client client){

        Client newClient = new Client();
        List<Address> addresses = client.getAddresses();

        newClient.setName(client.getName());

        addresses.stream().forEach(address -> address.setClient(client));;
        newClient.setAddresses(addresses);
        return newClient;
    }
}
