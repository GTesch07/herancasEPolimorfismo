package br.com.guilherme.tesch.models;

public abstract class TimeZone {
    private int hora;
    private int minuto;
    private int segundo;

    public TimeZone(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida. Deve ser entre 0 e 23.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto inválido. Deve ser entre 0 e 59.");

        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo inválido. Deve ser entre 0 e 59.");
        }
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void ajustarhorario(TimeZone outroRelogio);
}
