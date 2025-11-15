/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appbanco;

/**
 *
 * @author Marcelo
 */
public class AppBanco {
    

    public static void main(String[] args) {
     ContaBanco p1 = new ContaBanco();
     p1.setNumConta(12345);
     p1.setDono("Isabelle");
     p1.abrirConta("CC");
    
     ContaBanco p2 = new ContaBanco();
     p2.setNumConta(34567);
     p2.setDono("Marcelo");
     p2.abrirConta("CP");
     
     p1.depositar(100);
     p2.depositar(500);
      
    
     p1.estadoAtual();
    p2.estadoAtual(); 
    }
}
