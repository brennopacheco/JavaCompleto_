package Módulo01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _04EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // detalhe: Locale deve estar antes de Scanner para funcionar
        Scanner sc = new Scanner(System.in);



        String palavra;
        palavra = sc.next();
        System.out.println("Você digitou: " + palavra);

        System.out.println("_____________");

        int inteiro;
        inteiro = sc.nextInt();
        System.out.println("Você digitou: " + inteiro);

        System.out.println("_____________");

        double flutuante;
        flutuante = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", flutuante);

        System.out.println("_____________");

        char caractere;
        caractere = sc.next().charAt(0);
        System.out.println("Você digitou: " + caractere);

        System.out.println("_____________");


        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }
}
