/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

/**
 *
 * @author a120088
 */
public class Laboratorio {
    private int capacidade;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public Laboratorio(){
        capacidade = 0;
    }
    
    public void inicializar(){
        Laboratorio lab1 = new Laboratorio();
        Laboratorio lab2 = new Laboratorio();
        Laboratorio lab3 = new Laboratorio();
        Laboratorio lab4 = new Laboratorio();
    }
}
