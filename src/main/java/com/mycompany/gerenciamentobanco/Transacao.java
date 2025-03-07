package com.mycompany.gerenciamentobanco;
import java.time.LocalDateTime;
public class Transacao {
    private double valor;
    private String tipoTransacao;
    private LocalDateTime dataHora;
    private String descricao;
    private Conta origem;
    private Conta destino;
    /* imbut taxa aqui na transacao*/
    
    public Transacao(String tipoTransacao, double valor, Conta origem, Conta destino, String descricao){
        this.valor = valor;       
        this.tipoTransacao = tipoTransacao;
        this.dataHora = LocalDateTime.now();
        this.origem = origem;
        this.destino = destino;
        this.descricao = descricao;
    }
    public void processarTransacao(){
        switch(tipoTransacao){
            case "deposito":
                this.origem.setSaldo(this.origem.getSaldo() + valor);
                break;
            case "saque":
                if(this.origem.getSaldo()>= valor){
                    this.origem.setSaldo(this.origem.getSaldo() - valor);                
                }else{
                    System.out.println("Saldo insuficiente para transacao.");
                }
                break;
            case "transferencia":
                if (this.origem.getSaldo()>= valor){
                    if(this.origem != this.destino){
                        this.origem.setSaldo(this.origem.getSaldo() - valor);
                        this.destino.setSaldo(this.destino.getSaldo() + valor);                    
                    }else{
                        System.out.println("Saldo insuficiente para transacao");
                    }
                    break;
                }

            default:
                System.out.println("Tipo de transacao inválida");
                break;                
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Conta getOrigem() {
        return origem;
    }

    public void setOrigem(Conta origem) {
        this.origem = origem;
    }

    public Conta getDestino() {
        return destino;
    }

    public void setDestino(Conta destino) {
        this.destino = destino;
    }
    @Override
    public String toString() {
        return "Tipo: " + tipoTransacao + "\n" +
               "Valor: R$ " + valor + "\n" +
               "Data/Hora: " + dataHora + "\n" +
               "Descricao: " + descricao + "\n";
    }
    
}
