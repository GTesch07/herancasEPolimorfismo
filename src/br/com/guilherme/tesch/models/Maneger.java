package br.com.guilherme.tesch.models;

public non-sealed class Maneger extends Employee {

    private Double commission;

    public Maneger(String name, String login, String password, Boolean administrator, Double commission) {
        super.setName(name);
        super.setLogin(login);
        super.setPassword(password);
        super.setAdministrator(administrator);
        this.commission = commission;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + super.getName());
        System.out.println("Login: " + super.getLogin());
        System.out.println("Senha: " + super.getPassword());
        System.out.println("Administrador: " + super.getAdministrator());
        System.out.println("Comissão: " + commission);
    }
}
