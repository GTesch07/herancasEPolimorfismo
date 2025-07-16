package br.com.guilherme.tesch.models;

public non-sealed class Salesman extends Employee {
    private double percentPerSold;
    private int quantitySold;

    public Salesman(String name, String email, String password, int quantitySold) {
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
        this.quantitySold = quantitySold;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public void imprimirDetalhes() {
        System.out.println("Name: " + super.getName());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Password: " + super.getPassword());
        System.out.println("Quantity Sold: " + quantitySold);
    }
}
