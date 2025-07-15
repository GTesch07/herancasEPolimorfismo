package br.com.guilherme.tesch.models;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nameFilm, String typeAudio) {
        super(valor, nameFilm, typeAudio);
    }

    @Override
    public double getValorReal() {
        return getValor() / 2;
    }
}
