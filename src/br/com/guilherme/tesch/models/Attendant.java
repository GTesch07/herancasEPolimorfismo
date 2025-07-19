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

    public void imprimirDetalhes() {
        System.out.println("\nName: " + super.getName());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Password: " + super.getPassword());
        System.out.println("Administrator: " + super.getAdministrator());
    }
}
