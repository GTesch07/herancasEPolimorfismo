package br.com.guilherme.tesch.models;

public non-sealed class Salesman extends Employee {
    private int quantitySold;

    public Salesman(String name, String email, String password, int quantitySold) {
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
        super.setAdministrator(false);
        this.quantitySold = quantitySold;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void realizarVenda() {
        quantitySold++;
        System.out.println("Venda realizada. Total de vendas: " + quantitySold);
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas. Total: " + quantitySold);
    }

    public void realizarLogin() {
        System.out.println(getLogin() + " logou no sistema.");
    }

    public void realizarLogoff() {
        System.out.println(getLogin() + " saiu do sistema.");
    }

    public void alterarDados(String newLogin, String newEmail) {
        setLogin(newLogin);
        setEmail(newEmail);
        System.out.println("Dados alterados com sucesso!");
    }

    public void alterarSenha(String novaSenha) {
        setPassword(novaSenha);
        System.out.println("Senha alterada com sucesso.");
    }

    public void imprimirDetalhes() {
        System.out.println("Name: " + super.getName());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Password: " + super.getPassword());
        System.out.println("Administrator: " + super.getAdministrator());
        System.out.println("Quantity Sold: " + quantitySold);
    }
}
