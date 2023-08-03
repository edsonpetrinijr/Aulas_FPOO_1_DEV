package Atividade1;

import static java.lang.Math.*;
import java.util.Scanner;

public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        
        System.out.println("Area do circulo: " + Math.PI * pow(raio, 2));
        
        scanner.close();
    }
}
