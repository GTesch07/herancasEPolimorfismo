package br.com.guilherme.tesch.models;

public class USATimeZone extends TimeZone {
    public USATimeZone(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String getHoraFormatada() {
        String periodo = (getHora() < 12) ? "AM" : "PM";
        int hora12 = getHora() % 12;
        if (hora12 == 0)
            hora12 = 12;
        return String.format("%02d:%02d:%02d %s", hora12, getMinuto(), getSegundo(), periodo);
    }

    @Override
    public void ajustarhorario(TimeZone outroRelogio) {
        setHora(outroRelogio.getHora());
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());
        System.out.println("Horário ajustado no relógio dos EUA.");
    }

}
