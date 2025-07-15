package br.com.guilherme.tesch.main;

import br.com.guilherme.tesch.models.Ingresso;
import br.com.guilherme.tesch.models.IngressoFamilia;
import br.com.guilherme.tesch.models.MeiaEntrada;

public class CinemaTest {
    public static void main(String[] args) {

        Ingresso ingressoNormal = new Ingresso(30.0, "Superman", "Legendado");
        MeiaEntrada meiaEntrada = new MeiaEntrada(30.0, "Jurassic World", "Dublado");
        IngressoFamilia ingressoFamilia1 = new IngressoFamilia(30.0, "Quarteto Fantastico", "Legendado", 3);
        IngressoFamilia ingressoFamilia2 = new IngressoFamilia(30.0, "F1", "Dublado", 5);

        System.out.println("Ingresso normal:");
        ingressoNormal.imprimirDetalhes();
        System.out.println("\nIngresso Meia entrada:");
        meiaEntrada.imprimirDetalhes();
        System.out.println("\nIngresso Familia 1:");
        ingressoFamilia1.imprimirDetalhes();
        System.out.println("\nIngresso Familia 2:");
        ingressoFamilia2.imprimirDetalhes();

    }
}
