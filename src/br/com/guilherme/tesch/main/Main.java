package br.com.guilherme.tesch.main;

import java.util.Scanner;

import br.com.guilherme.tesch.models.Attendant;
import br.com.guilherme.tesch.models.Maneger;
import br.com.guilherme.tesch.models.Salesman;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Maneger maneger = new Maneger("Guilherme da Silva Tesch", "tesch.guilherme@hotmail.com", "guilherme_tesch",
                "123455");
        Salesman salesman = new Salesman("Monica Tesch", "monica@tesch.com", "12342", 8);
        Attendant attendant = new Attendant("Bob Max", "bob@max.com", "12345433");

        maneger.imprimirDetalhes();
        maneger.gerarRelatorioFinanceiro();
        maneger.consultarVendas();
        maneger.realizarLogin();
        maneger.realizarLogoff();
        maneger.alterarDados("Guilherme T.", "gui@tesch.com");
        maneger.alterarSenha("nova123");
        maneger.imprimirDetalhes();

        System.out.println("\n=============================\n");

        salesman.imprimirDetalhes();
        salesman.realizarVenda();
        salesman.consultarVendas();

        System.out.println("\n=============================\n");

        attendant.imprimirDetalhes();
        attendant.receberPagamento(100.0);
        attendant.fecharCaixa();
    }
}
