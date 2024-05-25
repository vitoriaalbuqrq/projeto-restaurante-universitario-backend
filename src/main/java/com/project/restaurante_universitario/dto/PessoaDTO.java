package com.project.restaurante_universitario.dto;

import com.project.restaurante_universitario.entities.Pessoa;

public class PessoaDTO {
    private Integer id;
    private String nome;
    private String cpf;
    private String telefoneWhatsapp;
    private String email;

    public PessoaDTO(){}

    public PessoaDTO(Pessoa entity) {
        id = entity.getId();
        nome = entity.getNome();
        cpf = entity.getCpf();
        telefoneWhatsapp = entity.getTelefoneWhatsapp();
        email = entity.getEmail();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefoneWhatsapp() {
        return telefoneWhatsapp;
    }

    
}