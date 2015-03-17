/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.impostoderenda.appMain;

import br.ifes.edu.poo2.impostoderenda.control.CalculoImposto;

/**
 *
 * @author Gustavo
 */
public class appMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculoImposto calculo = new CalculoImposto();
        calculo.calcula();
    }
    
}
