/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbanco;

/**
 *
 * @author Marcelo
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    

    public void estadoAtual(){
         System.out.println("-----------------------------");
         System.out.println("Conta:" + this.getNumConta());
          System.out.println("Tipo: " + this.getTipo());
           System.out.println("Dono:" + this.getDono());
            System.out.println("Saldo" + this.getSaldo());
            System.out.println("Status:" + this.getStatus());
    }
  public void abrirConta(String tipo){ //nao esquecer de colocar 
        //entre os paranteses a String que estamos mencionando
         this.setTipo(tipo); // nao esquecer de colocar o this
         this.setStatus(true);
         if("CC".equals(tipo)){
             //this.saldo = 50;
             this.setSaldo(50);
        }else if("CP".equals(tipo)){
            this.setSaldo(150);
         //this.saldo = 150;
          }
         System.out.println("Conta aberta com sucesso");
        }
         
       
     public void fecharConta(){
         if(this.getSaldo()>0){
             System.out.println("Conta com dinheiro, nao pode ser fechada");
         }else if (this.getSaldo()<0){
              System.out.println("Conta com debito, nao pode ser fechada");
             
         }
     }

     
     
     public void depositar(float valor){
     
     if  (this.getStatus()){
     this.setSaldo (this.getSaldo()+ valor);
      System.out.println("Deposito realizado com sucesso");
}else{
      System.out.println("Impossivel depositar em uma  conta fechada");

}
     }
     
     public void sacar( float valor){
         if (this.getStatus()){
             if (this.getSaldo() >= valor){
                 this.setSaldo(this.getSaldo() - valor);
                  System.out.println("Saque realizado na conte de "+ this.getDono());
             }else {
                  System.out.println("Saldo insuficiente para saque");
             }
         }else{
              System.out.println("Impossivel sacar de uma conta fechada");
         }
         
     }
     
     public void pagarMensal(){
         int valor = 0;
         if ("CC".equals(this.getTipo())){
             valor = 12;
         } else if ("CP".equals(this.getTipo())){
             valor = 20;
         }
         if (this.getStatus()){
             this.setSaldo(this.getSaldo()- valor);
              System.out.println("Mensalidade paga com sucesso" + this.getDono());
         }else{
              System.out.println("Impossivel pagar com conta fechada");
         }
     }
     
    /**
     *
     */
    public ContaBanco() { //coloquei um float desnecessario dentro doas parenteses ai o codigo na main tava dando erro
        this.saldo = 0;
        this.status = false;
    }
     
   
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    

   
  
}
