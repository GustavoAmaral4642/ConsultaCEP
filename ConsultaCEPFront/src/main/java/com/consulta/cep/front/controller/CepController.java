package com.consulta.cep.front.controller;


import com.consulta.cep.front.integration.CallApiConsultaCep;
import com.consulta.cep.front.model.AddressModel;
import com.consulta.cep.front.model.CepModel;
import com.consulta.cep.front.model.ClientModel;
import com.consulta.cep.front.service.CepService;
import com.consulta.cep.front.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@Component
@ManagedBean
@ViewScoped
public class CepController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private CepService cepService;

    private String cep;

    private CepModel cepModel = new CepModel();

    private ClientModel clientModel;

    private AddressModel addressModel;

    @PostConstruct
    public void init() {
        this.clientModel = new ClientModel();
        this.addressModel = new AddressModel();
    }

    public void findCep(){
        cleanCep();
        CepModel cep = cepService.get(getCep());
        mapperModelToScreen(cep);
    }

    public void saveClient(){

        if(clientModel != null && !clientModel.getName().isEmpty()){
            if(cepModel != null && !cepModel.getCep().isEmpty()){
                mapperCepToAddress(cepModel);

                addressModel.setClient(clientModel);
                clientModel.getAddresses().add(addressModel);
                clientService.saveClient(clientModel);

                cleanClientAddress();
                cleanCep();
                setCep("");

                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Operação realizada com sucesso"));
            }
        }
    }

    public ClientModel getClientModel() {
        return clientModel;
    }

    public void setClientModel(ClientModel clientModel) {
        this.clientModel = clientModel;
    }

    public void cleanCep(){
        cepModel = new CepModel();
    }

    public void cleanClientAddress(){
        addressModel = new AddressModel();
        clientModel = new ClientModel();
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

    private void mapperCepToAddress(CepModel cep) {
        addressModel.setCep(cep.getCep());
        addressModel.setLogradouro(cep.getLogradouro());
        addressModel.setComplemento(cep.getComplemento());
        addressModel.setUnidade(cep.getUnidade());
        addressModel.setBairro(cep.getBairro());
        addressModel.setLocalidade(cep.getLocalidade());
        addressModel.setUf(cep.getUf());
        addressModel.setEstado(cep.getEstado());
        addressModel.setRegiao(cep.getRegiao());
        addressModel.setIbge(cep.getIbge());
        addressModel.setGia(cep.getGia());
        addressModel.setDdd(cep.getDdd());
        addressModel.setSiafi(cep.getSiafi());
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
