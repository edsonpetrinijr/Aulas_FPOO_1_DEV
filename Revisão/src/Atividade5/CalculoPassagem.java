package Atividade5;

import java.util.Scanner;

public class CalculoPassagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia da viagem em km: ");
        double distancia = scanner.nextDouble();

        CalculadoraPassagem calculadora = new CalculadoraPassagem(distancia);

        System.out.println("Distancia da viagem: " + distancia + " km");
        System.out.println("Preço da passagem: R$ " + calculadora.getPreco());

        scanner.close();
    }
}
