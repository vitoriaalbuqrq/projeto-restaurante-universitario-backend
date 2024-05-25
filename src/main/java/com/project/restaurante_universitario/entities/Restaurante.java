package com.project.restaurante_universitario.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_restaurante")
class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nomeRestaurante;
    
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoaResponsavel;

    @Column(length = 255)
    private Integer capacidadeRefeicao;

    @Column(length = 10)
    private String horarioCafeDaManha;

    @Column(length = 10)
    private String horarioAlmoco;

    @Column(length = 10)
    private String horarioJantar;

    @Column(length = 255)
    private String diasFuncionamento;

    public Restaurante(){}

    public Restaurante(Integer id, String nomeRestaurante, Endereco endereco, Pessoa pessoaResponsavel,
            Integer capacidadeRefeicao, String horarioCafeDaManha, String horarioAlmoco, String horarioJantar,
            String diasFuncionamento) {
        this.id = id;
        this.nomeRestaurante = nomeRestaurante;
        this.endereco = endereco;
        this.pessoaResponsavel = pessoaResponsavel;
        this.capacidadeRefeicao = capacidadeRefeicao;
        this.horarioCafeDaManha = horarioCafeDaManha;
        this.horarioAlmoco = horarioAlmoco;
        this.horarioJantar = horarioJantar;
        this.diasFuncionamento = diasFuncionamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(Pessoa pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public Integer getCapacidadeRefeicao() {
        return capacidadeRefeicao;
    }

    public void setCapacidadeRefeicao(Integer capacidadeRefeicao) {
        this.capacidadeRefeicao = capacidadeRefeicao;
    }

    public String getHorarioCafeDaManha() {
        return horarioCafeDaManha;
    }

    public void setHorarioCafeDaManha(String horarioCafeDaManha) {
        this.horarioCafeDaManha = horarioCafeDaManha;
    }

    public String getHorarioAlmoco() {
        return horarioAlmoco;
    }

    public void setHorarioAlmoco(String horarioAlmoco) {
        this.horarioAlmoco = horarioAlmoco;
    }

    public String getHorarioJantar() {
        return horarioJantar;
    }

    public void setHorarioJantar(String horarioJantar) {
        this.horarioJantar = horarioJantar;
    }

    public String getDiasFuncionamento() {
        return diasFuncionamento;
    }

    public void setDiasFuncionamento(String diasFuncionamento) {
        this.diasFuncionamento = diasFuncionamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Restaurante other = (Restaurante) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}