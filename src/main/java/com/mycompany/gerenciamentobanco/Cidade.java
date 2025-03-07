package com.mycompany.gerenciamentobanco;
import java.util.HashMap;
import java.util.Map;

public class Cidade {
    private static Map<String, Integer> cidades = new HashMap<>();
    
    static {
        cidades.put("Itu", 1001);
        cidades.put("Salto", 1002);
        cidades.put("Campinas", 1003);
        cidades.put("Indaiatuba", 1004);
        cidades.put("Porto Feliz", 1005);
        cidades.put("Capivari", 1006);
        cidades.put("Outras", 2000);
    }
    public static Integer getNumAgencia(String cidade){
        return cidades.get(cidade);
    }
    public static boolean cidadeExiste(String cidade){
        return cidades.containsKey(cidade);
    }
}
