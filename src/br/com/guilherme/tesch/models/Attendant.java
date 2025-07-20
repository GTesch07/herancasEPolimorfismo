package br.com.guilherme.tesch.models;

public non-sealed class Attendant extends Employee {

    private double cashValue;

    public Attendant(String name, String email, String password) {
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
        super.setAdministrator(false);
        this.cashValue = 0.0;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void receberPagamento(double value) {
        cashValue += value;
        System.out.println("Pagamento de R$" + value + " recebido com sucesso. Total em caixa: R$ " + cashValue);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Total: R$ " + cashValue);
        cashValue = 0.0;
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
        System.out.println("\nName: " + super.getName());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Password: " + super.getPassword());
        System.out.println("Administrator: " + super.getAdministrator());
        System.out.println("Valor em caixa: R$ " + cashValue);
    }
}
