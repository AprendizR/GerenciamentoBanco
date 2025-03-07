package com.mycompany.gerenciamentobanco;

public class GerenciamentoBanco {

    public static void main(String[] args) {
        CPFGenerator cpfGenerator = new CPFGenerator();
        Cliente c1 = new Cliente("Renan", (short)2000, 'M', "Rua dos Sonhos, 204", cpfGenerator, 3);
        Corrente conta1 = new Corrente(c1, "Pirapora", 123456, 1000, 2000, 1500, "pedreiro", "credito");
        
        System.out.println(conta1);
      
    }
}
