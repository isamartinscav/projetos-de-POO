/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04cursoemvideo;

/**
 *
 * @author Marcelo
 */
public class Aula04cursoemvideo {

    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2("NIC", "Amarelo", 0.4f);
        c1.status(); //assim fica mais facil, posso criar quantas canetas eu quiser e simplificado
        
        
        Caneta2 c2 = new Caneta2("BIC", "Preto", 0.5f);
        c2.status();
       //c1.setModelo("Bic");
      // c1.modelo = "BIC"; //acessei diretamente o atributo
       // c1.setPonta(0.5f);//
        //c1.ponta = 0.5f; //da erro pois o ponta e privado
       // c1.status();
       
       // System.out.println("Tenho uma caneta " + c1.getModelo()+ " de ponta " + c1.getPonta());
    }
}
