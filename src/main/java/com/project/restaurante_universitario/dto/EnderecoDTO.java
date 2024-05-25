package com.project.restaurante_universitario.dto;

import com.project.restaurante_universitario.entities.Endereco;

public class EnderecoDTO {
    private Integer id;
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public EnderecoDTO(){}

    public EnderecoDTO(Endereco entity) {
        id = entity.getId();
        rua = entity.getRua();
        numero = entity.getNumero();
        cep = entity.getCep();
        cidade = entity.getCidade();
        estado = entity.getEstado();
        pais = entity.getPais();
    }

    public Integer getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }
    
    
}
