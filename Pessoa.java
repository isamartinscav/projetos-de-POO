/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppessoa;

/**
 *
 * @author Marcelo
 */
public class Pessoa {
    
    protected String nome;
    protected String cpf;
    protected String dataNasc;

    public Pessoa(){
        nome = "";
        cpf = "";
        dataNasc = "";
    }
     
    public Pessoa(String nome, String cpf, String dataNasc){
         this.nome = nome; //atributo da classe que vai receber o parametro
         this.cpf = cpf;
         this.dataNasc = dataNasc;
     }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome:"+nome);
        System.out.println("Cpf:"+cpf);
        System.out.println("DataNasc:"+dataNasc);
        
    }
}
