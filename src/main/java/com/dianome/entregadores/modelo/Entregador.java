package com.dianome.entregadores.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Entregador {

    @Id
    private String cpf;
    private String nome;
    private Double capacidadeDoVeiculo;

    public Entregador() {
    }

    public Entregador(String cpf, String nome, Double capacidadeDoVeiculo) {
        this.cpf = cpf;
        this.nome = nome;
        this.capacidadeDoVeiculo = capacidadeDoVeiculo;
    }

    // Getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Double getCapacidadeDoVeiculo() {
        return capacidadeDoVeiculo;
    }

    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidadeDoVeiculo(Double capacidadeDoVeiculo) {
        this.capacidadeDoVeiculo = capacidadeDoVeiculo;
    }
}
