package com.consulta.cep.front.service;

import com.consulta.cep.front.integration.CallApiConsultaCep;
import com.consulta.cep.front.model.CepModel;
import com.consulta.cep.front.service.mapper.CepStringToCepModel;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    public CepModel get(String numCep) {

        String cepFound = CallApiConsultaCep.find(numCep);
        return CepStringToCepModel.mapper(cepFound);
    }

}
