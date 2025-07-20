package br.com.guilherme.tesch.models;

public non-sealed class Maneger extends Employee {

    public Maneger(String name, String email, String login, String password) {
        super.setName(name);
        super.setEmail(email);
        super.setLogin(login);
        super.setPassword(password);
        super.setAdministrator(true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas...");
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

    public void alterarSenha(String newPassword) {
        setPassword(newPassword);
        System.out.println("Senha alterada com sucesso!");
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + super.getName());
        System.out.println("Login: " + super.getLogin());
        System.out.println("Senha: " + super.getPassword());
        System.out.println("Administrador: " + super.getAdministrator());

    }
}
