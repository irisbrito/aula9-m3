package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static List<Fatura> pesquisarFaturaPeloEmailDoConsumidor(String email){
        List<Fatura> faturasDoConsumidor = new ArrayList<>();
        for (Fatura fatura : faturas){
            if(fatura.getConsumidor().getEmail().equalsIgnoreCase(email)){
                 faturasDoConsumidor.add(fatura);
            }
        }
        return faturasDoConsumidor;
    }

    public static Fatura cadastrarFatura(String email, double valor, String dataVencimento) throws Exception{
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidor(email);
        Fatura fatura = new Fatura(consumidor, valor,dataVencimento);
        faturas.add(fatura);
        return fatura;
    }



}
