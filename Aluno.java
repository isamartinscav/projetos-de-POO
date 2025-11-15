/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apppessoa;

/**
 *
 * @author Marcelo
 */
public class Aluno {
    public class Aluno extends Pessoa{
     private Integer matricula; 

    public Aluno(){
        matricula = 0;
    }
    
    public Aluno(String nome, String cpf, String dataNasc, Integer matricula){
    super(nome,cpf,dataNasc);
    this.matricula = matricula;
    }
    
    public Aluno(){
        super("","","");
        matricula = "";
        
    }

        public Integer getMatricula() {
            return matricula;
        }

        public void setMatricula(Integer matricula) {
            this.matricula = matricula;
        }
    
 }
    
    
public void imprimirAluno(){
super.imprimirPessoa();
System.out.println("matricula"+matricula);
}
    
}
