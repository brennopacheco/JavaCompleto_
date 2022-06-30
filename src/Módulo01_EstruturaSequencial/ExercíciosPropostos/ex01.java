package Módulo01_EstruturaSequencial.ExercíciosPropostos;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
         * mensagem explicativa, conforme exemplos.
         * */

        Scanner sc = new Scanner(System.in);

        int a, b, resultado;
        System.out.println("Digite os valores de ");
        System.out.println("a:");
        a = sc.nextInt();
        System.out.println("b:");
        b = sc.nextInt();

        resultado = a + b;
        System.out.println("Soma: " + resultado);


        sc.close();
    }
}
