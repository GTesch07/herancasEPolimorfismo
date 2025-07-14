package br.com.guilherme.tesch.main;

import java.util.Scanner;

import br.com.guilherme.tesch.models.Maneger;
import br.com.guilherme.tesch.models.Salesman;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Maneger maneger = new Maneger();
        Salesman salesman = new Salesman();

        maneger.setName("Guilherme da Silva Tesch");
        maneger.setLogin("guilherme_tesch");
        maneger.setPassword("1234");
        maneger.setCommission("2500.32");

        salesman.setName("Mario");
        salesman.setCode("12342345");

        System.out.println(maneger.getName());
        System.out.println(salesman.getName());

        scanner.close();
    }
}
