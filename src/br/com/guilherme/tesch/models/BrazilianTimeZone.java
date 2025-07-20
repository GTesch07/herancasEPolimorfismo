package br.com.guilherme.tesch.models;

public class BrazilianTimeZone extends TimeZone {
    public BrazilianTimeZone(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", getHora() + 3, getMinuto(), getSegundo());
    }

    @Override
    public void ajustarhorario(TimeZone outroRelogio) {
        setHora(outroRelogio.getHora() + 3);
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());
        System.out.println("Horário ajustado no relógio brasileiro.");

    }

}
