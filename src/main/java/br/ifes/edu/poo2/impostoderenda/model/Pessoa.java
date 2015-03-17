/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.impostoderenda.model;

/**
 *
 * @author Gustavo
 */
public class Pessoa {
    private double receita;
    
    public Pessoa(double receita){
        this.receita = receita;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }
    
}
