package Módulo01_EstruturaSequencial.ExercíciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler:
         * o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
         * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago
         * */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, numPecas1, code2, numPecas2;
        double valorPeca1, valorPeca2, valorPagar;

        System.out.println("Código Peça 1:");
        code1 = sc.nextInt();
        System.out.println("Quantidade de Peças 1:");
        numPecas1 = sc.nextInt();
        System.out.println("Valor Peça 1:");
        valorPeca1 = sc.nextDouble();

        System.out.println("Código Peça 2:");
        code2 = sc.nextInt();
        System.out.println("Quantidade de Peças 2:");
        numPecas2 = sc.nextInt();
        System.out.println("Valor Peça 2:");
        valorPeca2 = sc.nextDouble();

        valorPagar = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);


        sc.close();
    }
}
