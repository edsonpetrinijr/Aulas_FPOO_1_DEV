package Atividade9;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores deseja inserir? ");
        int quantidadeValores = scanner.nextInt();

        double[] valores = new double[quantidadeValores];

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        double media = calcularMedia(valores);

        System.out.println("Media dos valores inseridos: " + media);

        scanner.close();
    }

    public static double calcularMedia(double... valores) {
        double soma = 0;

        for (double valor : valores) {
            soma += valor;
        }

        return soma / valores.length;
    }
}
