package br.com.guilherme.tesch.models;

public class Ingresso {
    private double valor;
    private String nameFilm;
    private String typeAudio;

    public Ingresso(double valor, String nameFilm, String typeAudio) {
        this.valor = valor;
        this.nameFilm = nameFilm;
        this.typeAudio = typeAudio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorReal() {
        return valor;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getTypeAudio() {
        return typeAudio;
    }

    public void setTypeAudio(String typeAudio) {
        this.typeAudio = typeAudio;
    }

    // public void imprimirDetalhes() {
    // System.out.printf("""
    // Filme: %s
    // Tipo de aúdio: %s
    // Valor real: %.2f
    // """, getNameFilm(), getTypeAudio(), getValor());
    // }
    public void imprimirDetalhes() {
        System.out.println("Filme: " + nameFilm);
        System.out.println("Tipo de Áudio: " + typeAudio);
        System.out.println("Valor real: R$ " + String.format("%.2f", getValorReal()));
    }
}
