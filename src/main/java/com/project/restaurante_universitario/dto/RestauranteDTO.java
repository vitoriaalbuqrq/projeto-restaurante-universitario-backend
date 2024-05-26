package com.project.restaurante_universitario.dto;

import com.project.restaurante_universitario.entities.Endereco;
import com.project.restaurante_universitario.entities.Restaurante;
import com.project.restaurante_universitario.entities.Pessoa;

public class RestauranteDTO {

    private Integer id;
    private String nomeRestaurante;
    private Endereco endereco;
    private Integer enderecoId;
    private Pessoa pessoaResponsavel;
    private Integer pessoaResponsavelId;
    private Integer capacidadeRefeicao;
    private String horarioCafeDaManha;
    private String horarioAlmoco;
    private String horarioJantar;
    private String diasFuncionamento;

    public RestauranteDTO(){}

    public RestauranteDTO(Restaurante entity){
        id = entity.getId();
        nomeRestaurante = entity.getNomeRestaurante();
        endereco = entity.getEndereco();
        pessoaResponsavel = entity.getPessoaResponsavel();
        capacidadeRefeicao = entity.getCapacidadeRefeicao();
        horarioCafeDaManha = entity.getHorarioCafeDaManha();
        horarioAlmoco = entity.getHorarioAlmoco();
        horarioJantar = entity.getHorarioJantar();
        diasFuncionamento = entity.getDiasFuncionamento();
        enderecoId = entity.getEndereco().getId();
        pessoaResponsavelId = entity.getPessoaResponsavel().getId();
    }

    public Integer getId() {
        return id;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Pessoa getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public Integer getCapacidadeRefeicao() {
        return capacidadeRefeicao;
    }

    public String getHorarioCafeDaManha() {
        return horarioCafeDaManha;
    }

    public String getHorarioAlmoco() {
        return horarioAlmoco;
    }

    public String getHorarioJantar() {
        return horarioJantar;
    }

    public String getDiasFuncionamento() {
        return diasFuncionamento;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public Integer getPessoaResponsavelId() {
        return pessoaResponsavelId;
    }

    
}

