package br.com.guilherme.tesch.models;

public class IngressoFamilia extends Ingresso {
    @Override
    public double getValor() {
        return getValor() * 0.5;
    }
}
