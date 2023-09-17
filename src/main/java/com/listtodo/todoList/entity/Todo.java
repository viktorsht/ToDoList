package com.listtodo.todoList.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")

public class Todo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descricao;
    private boolean realizado;
    private int prioridade;
    
    public Todo(String name, String descricao, boolean realizado, int prioridade) {
        this.name = name;
        this.descricao = descricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDecricao() {
        return descricao;
    }
    
    public void setDecricao(String descricao) {
        this.descricao = descricao;
    }
    
    public boolean isRealizado() {
        return realizado;
    }
    
    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    
    public int getPrioridade() {
        return prioridade;
    }
    
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

}