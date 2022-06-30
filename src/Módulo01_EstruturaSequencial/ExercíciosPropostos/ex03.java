package Módulo01_EstruturaSequencial.ExercíciosPropostos;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler quatro valores inteiros A, B, C e D.
         * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
         * DIFERENCA = (A * B - C * D).
         * */

        Scanner sc = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;

        System.out.println("A:");
        A = sc.nextInt();
        System.out.println("B:");
        B = sc.nextInt();
        System.out.println("C:");
        C = sc.nextInt();
        System.out.println("D:");
        D = sc.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
