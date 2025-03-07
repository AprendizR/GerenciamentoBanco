package com.mycompany.gerenciamentobanco;

public class Cliente {
    private String nome;
    private short nasc;
    private String cpf;
    private char sexo;
    private String endereco;
    private int anosBanco;
    private String profissao;
    
    public Cliente(String nome, short nasc, char sexo, String endereco, CPFGenerator cpfGenerator, int anosBanco){
        this.nome = nome;
        this.nasc = nasc;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpfGenerator.gerarCPFUnico(); //gerador de cpf
        this.anosBanco = anosBanco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getNasc() {
        return nasc;
    }

    public void setNasc(short nasc) {
        this.nasc = nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnosBanco() {
        return anosBanco;
    }

    public void setAnosBanco(int anosBanco) {
        this.anosBanco = anosBanco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Ano de Nascimento: " + nasc + "\n" +
               "Sexo: " + sexo + "\n" +
               "Endereco: " + endereco + "\n" +
               "CPF: " + cpf + "\n" +
               "Cliente ha: " + anosBanco + "\n" +
               "Profissao: " + profissao;
    }
    
    
}
