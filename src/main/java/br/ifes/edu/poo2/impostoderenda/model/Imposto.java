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
public interface Imposto {
    public double calculoImposto(Pessoa p);
    public double getAliquota(Pessoa p);
}
