/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppessoa;

/**
 *
 * @author Marcelo
 */
public class Funcionario extends Pessoa{
    private Double Salario;
    
    private String dataAdm;
     
    private String Cargo;
    
     public Funcionario(){
         super("","","");
        Funcionario = 0.0;
        dataAdm = "";
    }
     
     public Funcionario (String nome, String cpf, String dataNasc, Double Salaio, String dataAdm, String cargo ){
         super(nome,cpf,dataNasc);
         this.Salario = Salario;
         this.Cargo = Cargo;
     }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public String getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(String dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
     
     
     public void imprimirFuncionario(){
         super.imprimirPessoa();
         System.out.println("Salario:"+Salario);
         System.out.println("Data Admissao:"+dataAdm);
         System.out.println("Cargo:"+Cargo);
     }
}
