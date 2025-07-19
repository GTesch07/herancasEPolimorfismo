package br.com.guilherme.tesch.models;

public non-sealed class Attendant extends Employee {

    private double cashValue;

    public Attendant(String name, String email, String password, boolean administrator) {
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
        super.setAdministrator(administrator);
    }

    public double getCashValue() {
        return cashValue;
    }
}
