package br.com.guilherme.tesch.models;

public class IngressoFamilia extends Ingresso {
    private int quantityPeeople;

    public IngressoFamilia(double valor, String nameFilm, String typeAudio) {
        super(valor, nameFilm, typeAudio);
    }

    public int getQuantityPeeople() {
        return quantityPeeople;
    }

    @Override
    public double getValor() {
        double total = getValor() * quantityPeeople;
        if (quantityPeeople > 3) {
            total *= 0.95;
        }
        return total;
    }
}
