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
public class AImposto implements Imposto{
    
    private AAliquota aliquota;
    
    public void setCorrectAliquota(double valor){
        if(valor <= 1700){
            aliquota = new Aliquota1();
        }else if(valor > 1700 && valor < 2560 ){
            aliquota = new Aliquota2();
        }else
            aliquota = new Aliquota3();
    }
    public double calculoImposto(Pessoa p){
        setCorrectAliquota(p.getReceita());
        return aliquota.getTaxa()*p.getReceita();
    }
    
    public double getAliquota(Pessoa p){
        return aliquota.getTaxa();
    }
}
