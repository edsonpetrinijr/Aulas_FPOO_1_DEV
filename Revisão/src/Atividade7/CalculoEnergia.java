package Atividade7;

import java.util.Scanner;

public class CalculoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de kWh consumidos: ");
        int quantidadeKwh = scanner.nextInt();

        System.out.print("Digite o tipo de instalacao (R para residencia, C para comercio, I para industria): ");
        char tipoInstalacao = scanner.next().charAt(0);

        CalculadoraEnergia calculadora = new CalculadoraEnergia(quantidadeKwh, tipoInstalacao);

        System.out.println("Valor a pagar: R$ " + calculadora.getPreco());

        scanner.close();
    }
}
