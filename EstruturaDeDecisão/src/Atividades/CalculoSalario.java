package Atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o cargo do funcionario (Gerente, Supervisor, Tecnico ou Auxiliar): ");
        String cargo = scanner.nextLine();

        double salarioBase = 0;
        double porcentagemINSS = 0;
        double convenio = 0;

        switch (cargo) {
            case "gerente":
                salarioBase = 5590;
                porcentagemINSS = 0.08;
                convenio = 289;
                break;
            case "supervisor":
                salarioBase = 4128;
                porcentagemINSS = 0.07;
                convenio = 239;
                break;
            case "tecnico":
                salarioBase = 3789;
                porcentagemINSS = 0.04;
                convenio = 189;
                break;
            case "auxiliar":
                salarioBase = 2345;
                porcentagemINSS = 0.02;
                convenio = 156;
                break;
            default:
                throw new AssertionError();
        }

        double descontoINSS = salarioBase * porcentagemINSS;
        double salarioFinal = salarioBase - descontoINSS - convenio;

        DecimalFormat df = new DecimalFormat("#.00");

        String salarioBaseFormatado = "R$ " + df.format(salarioBase);
        String descontoINSSFormatado = "R$ " + df.format(descontoINSS);
        String convenioFormatado = "R$ " + df.format(convenio);
        String salarioFinalFormatado = "R$ " + df.format(salarioFinal);

        System.out.println("Cargo: " + cargo);
        System.out.println("Salario Base: " + salarioBaseFormatado);
        System.out.println("Desconto INSS: " + descontoINSSFormatado);
        System.out.println("Desconto Convenio: " + convenioFormatado);
        System.out.println("Salario Final: " + salarioFinalFormatado);

        scanner.close();
    }
}
