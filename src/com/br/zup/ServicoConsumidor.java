package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static void validarEmail(String email) throws Exception {
        if(!email.contains("@")){
            throw new Exception("Email invalido");
        }
        for(Consumidor consumidor : consumidores){
            if(consumidor.getEmail().equals(email)){
                throw new Exception("O Email já existe meu cumbade");
            }
        }
    }
    public static Consumidor cadastrarConsumidor(String nomeCompleto, String email) throws Exception {
        validarEmail(email);
        Consumidor consumidor = new Consumidor(nomeCompleto, email);
        consumidores.add(consumidor);
        return consumidor;
    }

    public static Consumidor pesquisarConsumidor(String email) throws Exception {
        for(Consumidor consumidor : consumidores){
            if(consumidor.getEmail().equals(email)){
                return consumidor;
            }
        }
        throw new Exception("Consumidor não encontrado");
    }
}
