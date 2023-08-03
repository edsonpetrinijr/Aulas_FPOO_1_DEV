package Atividade4;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario do funcionario: R$ ");
        double salario = scanner.nextDouble();

        CalculadoraAumento calculadora = new CalculadoraAumento(salario);

        System.out.println("Salario anterior: R$ " + salario);
        System.out.println("Aumento: R$ " + calculadora.getAumento());
        System.out.println("Novo salario: R$ " + calculadora.getNovoSalario());

        scanner.close();
    }
}
