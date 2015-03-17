/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.impostoderenda.control;

import br.ifes.edu.poo2.impostoderenda.model.Imposto;
import br.ifes.edu.poo2.impostoderenda.model.ImpostoImpl;
import br.ifes.edu.poo2.impostoderenda.model.Pessoa;

/**
 *
 * @author Gustavo
 */
public class CalculoImposto {
    private Imposto imposto = new ImpostoImpl();
    private Pessoa pessoa;
    
    public void calcula(){
        pessoa = new Pessoa(6000);
        System.out.println("Imposto: " + imposto.calculoImposto(pessoa));
        System.out.println("Taxa: "+ imposto.getAliquota(pessoa)*100);
        
        pessoa = new Pessoa(1300);
        System.out.println("Imposto: " + imposto.calculoImposto(pessoa));
        System.out.println("Taxa: "+ imposto.getAliquota(pessoa)*100);
    }
}
