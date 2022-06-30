package Módulo01_EstruturaSequencial.ExercíciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        /*
         * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
         * o valor que recebe por hora e calcula o salário desse funcionário.
         * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
         * */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numFuncionario, horasTrabalhadas;
        double valorRecebePorHora, salario;

        System.out.println("Número Funcionário:");
        numFuncionario = sc.nextInt();

        System.out.println("Número Horas Trabalhadas:");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Valor que Recebe por Hora:");
        valorRecebePorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorRecebePorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);


        sc.close();
    }
}
