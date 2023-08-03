package Atividade6;

import java.util.Scanner;

public class SolicitarEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da casa: R$ ");
        double valorCasa = scanner.nextDouble();

        System.out.print("Digite o salario da pessoa: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos a pagar: ");
        int anosPagar = scanner.nextInt();

        AprovacaoEmprestimo aprovacao = new AprovacaoEmprestimo(valorCasa, salario, anosPagar);

        if (aprovacao.verificarAprovacao()) {
            System.out.println("Emprestimo aprovado");
        } else {
            System.out.println("Emprestimo nao aprovado. Valor da prestacao excede 30% do seu salario.");
        }

        scanner.close();
    }
}
