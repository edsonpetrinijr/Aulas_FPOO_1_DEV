import java.util.Scanner;

public class CalculoAluguelVeiculos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o veiculo que voce deseja alugar:");
        System.out.println("1. Fiat Argo (Valor diaria: R$ 98,00, Valor por km rodado: R$ 2,39)");
        System.out.println("2. Fiat Mobi (Valor diaria: R$ 79,00, Valor por km rodado: R$ 1,99)");
        System.out.println("3. Hyundai HB20 (Valor diaria: R$ 102,00, Valor por km rodado: R$ 2,99)");

        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        double valorDiaria = 0.0;
        double valorPorKmRodado = 0.0;

        if (opcao == 1) {
            valorDiaria = 98.0;
            valorPorKmRodado = 2.39;
        } else if (opcao == 2) {
            valorDiaria = 79.0;
            valorPorKmRodado = 1.99;
        } else if (opcao == 3) {
            valorDiaria = 102.0;
            valorPorKmRodado = 2.99;
        } else {
            System.out.println("Opcao invalida.");
            return;
        }

        System.out.print("Quantidade de dias de aluguel: ");
        int quantidadeDias = scanner.nextInt();

        System.out.print("Quantidade de quilometros rodados: ");
        double quilometrosRodados = scanner.nextDouble();

        double valorTotalDiarias = valorDiaria * quantidadeDias;
        double valorTotalKmRodado = valorPorKmRodado * quilometrosRodados;
        double valorTotalAluguel = valorTotalDiarias + valorTotalKmRodado;

        System.out.println("Valor total das diarias: R$ " + valorTotalDiarias);
        System.out.println("Valor total dos quilometros rodados: R$ " + valorTotalKmRodado);
        System.out.println("Valor total do aluguel: R$ " + valorTotalAluguel);

        scanner.close();
    }
}
