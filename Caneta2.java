/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04cursoemvideo;

/**
 *
 * @author Marcelo
 */
public class Caneta2 {

    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
   
    
    public Caneta2(String m, String c, float p){ // este e o metodo construtor
        //construtor nao usa void
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        //this.cor = "Azul";
        
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
         System.out.println("Modelo:" + this.modelo);
          System.out.println("Ponta:" + this.ponta);
          System.out.println("Cor:" + this.cor);
          System.out.println("Tampada:" + this.tampada);
        
    }
    
}
