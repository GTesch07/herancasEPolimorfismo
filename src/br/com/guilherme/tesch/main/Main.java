package br.com.guilherme.tesch.main;

import java.util.Scanner;

import br.com.guilherme.tesch.models.Maneger;
import br.com.guilherme.tesch.models.Salesman;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Maneger maneger = new Maneger("Guilherme da Silva Tesch", "guilherme_tesch", "21312313", true, 24000.00);
        Salesman salesman = new Salesman("Monica Tesch", "monica@tesch.com", "123456", 8, false);

        maneger.imprimirDetalhes();
        System.out.println("");
        salesman.imprimirDetalhes();
        scanner.close();
    }
}
