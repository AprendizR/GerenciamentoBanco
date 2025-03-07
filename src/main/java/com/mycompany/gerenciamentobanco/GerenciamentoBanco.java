package com.mycompany.gerenciamentobanco;

public class GerenciamentoBanco {

    public static void main(String[] args) {
        CPFGenerator cpfGenerator = new CPFGenerator();
        Cliente c1 = new Cliente("Renan", (short)2000, 'M', "Rua dos Sonhos, 204", cpfGenerator, 3);
        //Cliente c2 = new Cliente("Ana", (short)2000, 'F', "Rua dos Flores, 05", cpfGenerator);
        /*Cliente c3 = new Cliente("Renan3", (short)2002, 'M', "Rua dos Sonhos, 206", cpfGenerator);
        System.out.println(c3);
        Cliente c4 = new Cliente("Renan4", (short)2003, 'M', "Rua dos Sonhos, 207", cpfGenerator);
        System.out.println(c4);*/
        //Conta co1 = new Conta(c1, "pirapora", 123456, 0);
        //Conta co2 = new Conta(c2, "Jacaré", 123436, 0);
        /*System.out.println(co1);
        System.out.println(co2);*/
        //co1.setSaldo(500);
        //co2.setSaldo(1000);
        //Transacao t1 = new Transacao("transferencia", 223, co2, co1, "tranferencia");
        //t1.processarTransacao();
        Corrente conta1 = new Corrente(c1, "Pirapora", 123456, 1000, 2000, 1500, "pedreiro", "credito");
        
        System.out.println(conta1);
      
    }
}
