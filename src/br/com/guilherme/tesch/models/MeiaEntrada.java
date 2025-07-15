package br.com.guilherme.tesch.models;

public class MeiaEntrada extends Ingresso {
    @Override
    public double getValor() {
        return getValor() / 2;
    }
}
