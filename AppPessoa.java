/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apppessoa;

/**
 *
 * @author Marcelo
 */
public class AppPessoa {

    public static void main(String[] args) {
        pessoa p = new Pessoa();
        Aluno a= new Aluno();
        Funcionario f = new Funcionario();
        Professor pf =  new Professor();
        
        System.out.println("Imprimindo pessoa");
        p.imprimirPessoa();
        System.out.println("Imprimindo aluno");
        p.imprimirAluno();
        System.out.println("Imprimindo funcionario");
        p.imprimirFuncionario();
        System.out.println("Imprimindo professor");
        p.imprimirProfessor();
        
    }
}
