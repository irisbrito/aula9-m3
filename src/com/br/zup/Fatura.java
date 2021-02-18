package com.br.zup;

public class Fatura {
    private Consumidor consumidor;
    private double valor;
    private String dataVencimento;

    public Fatura(Consumidor consumidor, double valor, String dataVencimento) {
        this.consumidor = consumidor;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Fatura(double valor, String dataVencimento) {
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Fatura" +
                "\n consumidor= " + consumidor +
                "\n valor= " + valor +
                "\n dataVencimento= " + dataVencimento;
    }
}
