package com.mycompany.gerenciamentobanco;
public class Conta{
    private Cliente cliente;
    private String cidade;
    private int numConta;
    private Integer numAgencia;
    private double saldo;
    private String tipo;
    
    public Conta(Cliente cliente, String cidade, int numConta, double saldo) {  
            if (Cidade.cidadeExiste(cidade)){
                this.cidade = cidade;
                this.numAgencia = Cidade.getNumAgencia(cidade);
            } else {
                cidade = "Outra";
                this.numAgencia = 2000;
            }       
        this.cliente = cliente;
        this.cidade = cidade;
        this.numConta = numConta;
        this.saldo = saldo;
        }     

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Integer getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(Integer numAgencia) {
        this.numAgencia = numAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
     @Override
    public String toString() {
        return "Nome: " + cliente.getNome() + "\n" +
               "Cidade: " + cidade + "\n" +
               "Numero da Agencia: " + numAgencia + "\n" +
               "Numero da Conta: " + numConta + "\n" +
               "Saldo: R$ " + saldo;
    }
    
}
