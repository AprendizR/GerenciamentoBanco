package com.mycompany.gerenciamentobanco;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CPFGenerator {
    private Set<String> cpfsExistentes = new HashSet<>(); // evitando de criar um construtor e garantindo que esteja pronto para uso
    private Random random = new Random(); // evitando de criar um construtor e garantindo que esteja pronto para uso
    
    public String gerarCPFUnico(){
        String cpf;
        do {
            cpf = gerarCPF(); //pegou o cpf gerado
        }while (cpfsExistentes.contains(cpf)); //verifica se já contem o numero de CPF, se tiver, ele volta o looping
        cpfsExistentes.add(cpf);
        return formatarCPF(cpf);
    }
    private String gerarCPF(){
        StringBuilder sb = new StringBuilder(); //Não usa String porque ela é imutável, gera outra memória para modicar, no StringBuilder é só append.
        for (int i = 0; i <12; i++){
            int digito = random.nextInt(10); //gera um valor inteiro dentro do do limite desejado entre ()
            sb.append(digito);
        }
        return sb.toString();
    }
    private String formatarCPF(String cpf){
        return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
    }
    
    
    
    
    
}
