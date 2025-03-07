package com.mycompany.gerenciamentobanco;
public class Corrente extends Conta{
    private float valor;
    private double limiteCredito;
    private double receberSalario;
    private String tipo;
    private double taxa;
    public Corrente(Cliente cliente, String cidade, int numConta, double saldo, float valor, double limiteCredito, String profissao, String tipo) {
        super(cliente, cidade, numConta, saldo); 
        this.valor = valor;
        this.limiteCredito = definirLimiteCredito(cliente.getAnosBanco());
        this.receberSalario = salario(profissao);
        this.tipo = tipo;
        this.taxa = calcularTaxa();
    }
    private double calcularTaxa(){
        double taxaBase = 0.02;
        if (this.tipo.equalsIgnoreCase("credito")) {
            return this.valor * taxaBase;  // Taxa sobre o valor da compra, caso seja crédito
        } else if (this.tipo.equalsIgnoreCase("debito")) {
            return 0;  // Sem taxa para débito
        }
        return 0;
    }
    public String taxa() {
    StringBuilder resultado = new StringBuilder();
        switch(tipo){
            case "credito":
                if(this.getLimiteCredito() >= valor){
                    resultado.append("Compra realizada com sucesso\n");
                    this.setLimiteCredito(this.getLimiteCredito() - valor - calcularTaxa());
                    resultado.append("seu limite atual e: R$" + this.getLimiteCredito()+ "\n");
                }else{
                    resultado.append("Crédito insuficiente para transacao.\n");
                }
                break;
            case "debito":
                if(this.getSaldo() >= valor){
                    resultado.append("Compra realizada com sucesso\n");
                    this.setSaldo(this.getSaldo() - valor);
                    resultado.append("Valor atual: R$" + this.getSaldo()+"\n");
                }else{
                    resultado.append("Saldo insuficiente para realizar a transacao\n");
                }
                break;
            default:
                resultado.append("Não aceitamos esse tipo de pagamento.\n");
                break;                
            }        
        return resultado.toString();
    }
    private double definirLimiteCredito(int anosBanco){
        if (anosBanco < 1) {
            return 1000;
        } else if (anosBanco >= 1 && anosBanco < 3) {
            return 5000;
        } else if (anosBanco >= 3 && anosBanco < 5) {
            return 10000;
        } else {
            return 20000;
        }
    }
    private double salario(String profissao){
        if (profissao.equalsIgnoreCase("medico")){
            return 10000;
        }else if (profissao.equalsIgnoreCase("TI")) {
            return 5000;
        }else if (profissao.equalsIgnoreCase("engenheiro")){
            return 4000;            
        }else {
            return 2000;
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public double getReceberSalario() {
        return receberSalario;
    }

    public void setReceberSalario(double receberSalario) {
        this.receberSalario = receberSalario;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   @Override
    public String toString() {
        return 
               "Saldo: " + this.getSaldo() + "\n" +
               "Valor da compra: " + valor + "\n" +
               "Limite de credito: " + limiteCredito + "\n" +
               "Salario mensal: " + receberSalario + "\n" +
               "Tipo de pagamento: " + tipo + "\n" +               
               "Taxa: " + taxa();
        }
}
