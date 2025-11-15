/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcaderno;

/**
 *
 * @author Marcelo
 */
public class Caderno {
    
    String marca;
    String cor;
    String capadura;
   boolean aberto = false;
    boolean  fechado;
    boolean novo = true;
    boolean velho;
    
    void status (){
        System.out.println("marca:" + this.marca);
        System.out.println("cor:" + this.cor);
        System.out.println("capadura:" + this.capadura);
        System.out.println(this.aberto + "aberto:");
        System.out.println("fechado:" + this.fechado);
        System.out.println("novo" + this.novo);
        System.out.println("velho:" +this.velho);
    }
    
    void situacao(){
        if (this.aberto == true){
            System.out.println("Esta aberto");
        }else{
            System.out.println("Esta fechado");
        }
        if (this.novo == true){
             System.out.println("E novo");
        }else{
            System.out.println("E velho");
        }
        }
      
       
    }
    

   

