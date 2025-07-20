package br.com.guilherme.tesch.main;

import br.com.guilherme.tesch.models.BrazilianTimeZone;
import br.com.guilherme.tesch.models.USATimeZone;

public class MainTimeZone {
    public static void main(String[] args) {
        BrazilianTimeZone brazilianTimeZone = new BrazilianTimeZone(10, 30, 45);
        USATimeZone usaTimeZone = new USATimeZone(10, 15, 20);

        System.out.println("Horário Brasileiro: " + brazilianTimeZone.getHoraFormatada());
        System.out.println("Horário dos EUA: " + usaTimeZone.getHoraFormatada());

        brazilianTimeZone.ajustarhorario(usaTimeZone);

        System.out.println("Horário Brasileiro após ajuste " + brazilianTimeZone.getHoraFormatada());

    }
}
