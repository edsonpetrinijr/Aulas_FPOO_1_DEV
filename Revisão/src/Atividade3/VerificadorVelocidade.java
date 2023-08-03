package Atividade3;

import java.util.Scanner;

public class VerificadorVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro em km/h: ");
        int velocidade = scanner.nextInt();
        
        Multa multa = new Multa(velocidade);

        if (multa.getValorMulta() > 0) {
            System.out.println("Velocidade registrada: " + velocidade + " km/h");
            System.out.println("Limite de velocidade: 80 km/h");
            System.out.println("Voce estava " + (velocidade - 80) + " km/h acima do limite");
            System.out.println("Valor da multa: R$ " + multa.getValorMulta());
        } else {
            System.out.println("Voce estava dentro do limite de velocidade");
        }

        scanner.close();
    }
}
