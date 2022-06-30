package Módulo01_EstruturaSequencial.ExercíciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        /*
         * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
         * Em seguida, calcule e mostre:
         *
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * b) a área do círculo de raio C. (pi = 3.14159)
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * d) a área do quadrado que tem lado B.
         * e) a área do retângulo que tem lados A e B
         * */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        System.out.println("A:");
        A = sc.nextDouble();

        System.out.println("B:");
        B = sc.nextDouble();

        System.out.println("C:");
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);

        circulo = pi * (Math.pow(C, 2));
        System.out.printf("CIRCULO: %.3f%n", circulo);

        trapezio = ((A + B) * C) / 2;
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);

        quadrado = Math.pow(B, 2);
        System.out.printf("QUADRADO: %.3f%n", quadrado);

        retangulo = A * B;
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);


        sc.close();
    }
}
