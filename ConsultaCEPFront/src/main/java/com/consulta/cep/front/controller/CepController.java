package com.consulta.cep.front.controller;


import com.consulta.cep.front.integration.CallApiConsultaCep;
import com.consulta.cep.front.model.CepModel;
import com.consulta.cep.front.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

@Component
@ManagedBean
@ViewScoped
public class CepController {

    @Autowired
    private CepService cepService;

    private String cep;

    private CepModel cepModel = new CepModel();

    public void findCep(){

        cleanCep();
        CepModel cep = cepService.get(getCep());
        mapperModelToScreen(cep);
    }

    public void cleanCep(){
        cepModel = new CepModel();
    }

    private void mapperModelToScreen(CepModel cep) {

        cepModel.setCep(cep.getCep());
        cepModel.setLogradouro(cep.getLogradouro());
        cepModel.setComplemento(cep.getComplemento());
        cepModel.setUnidade(cep.getUnidade());
        cepModel.setBairro(cep.getBairro());
        cepModel.setLocalidade(cep.getLocalidade());
        cepModel.setUf(cep.getUf());
        cepModel.setEstado(cep.getEstado());
        cepModel.setRegiao(cep.getRegiao());
        cepModel.setIbge(cep.getIbge());
        cepModel.setGia(cep.getGia());
        cepModel.setDdd(cep.getDdd());
        cepModel.setSiafi(cep.getSiafi());
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public CepModel getCepModel() {
        return cepModel;
    }

    public void setCepModel(CepModel cepModel) {
        this.cepModel = cepModel;
    }
}
