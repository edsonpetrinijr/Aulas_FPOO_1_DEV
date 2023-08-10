package Atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoValorConstrucao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a largura do terreno (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Informe o comprimento do terreno (em metros): ");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;
        double valorPorMetroQuadrado;

        if (area <= 250) {
            valorPorMetroQuadrado = 8.50;
        } else if (area <= 350) {
            valorPorMetroQuadrado = 9.50;
        } else {
            valorPorMetroQuadrado = 11.50;
        }

        double valorTotal = area * valorPorMetroQuadrado;

        DecimalFormat df = new DecimalFormat("#.00");
        String areaFormatada = df.format(area);
        String valorPorMetroQuadradoFormatado = df.format(valorPorMetroQuadrado);
        String valorTotalFormatado = df.format(valorTotal);

        System.out.println("Area do terreno: " + areaFormatada + "m2");
        System.out.println("Valor por metro quadrado: R$ " + valorPorMetroQuadradoFormatado);
        System.out.println("Valor total a ser pago: R$ " + valorTotalFormatado);

        scanner.close();
    }
}
