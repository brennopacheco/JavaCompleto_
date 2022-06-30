package Módulo01_EstruturaSequencial;

import java.util.Locale;

public class _01Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        int idade = 31;
        String nome = "Maria";
        double renda = 4000;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x); // printf
        Locale.setDefault(Locale.US); // alterando a localizção das configurações do PC (trocando , por .)
        System.out.printf("%.4f%n", x); // printf
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros %n", x); // printf

        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);

    }
}
