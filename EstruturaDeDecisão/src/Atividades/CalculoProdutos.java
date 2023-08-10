
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoProdutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o item que voce deseja comprar:");
        System.out.println("1. Notebook Lenovo (R$ 3299,00)");
        System.out.println("2. Celular MotoG22 (R$ 1789,00)");
        System.out.println("3. Carro HB20 (R$ 68000,00)");
        System.out.println("4. Apartamento (R$ 180000,00)");

        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        double valorTotal = 0.0;
        double percentualEconomizar = 0.0;

        if (opcao == 1) {
            valorTotal = 3299.0;
            percentualEconomizar = 0.05;
        } else if (opcao == 2) {
            valorTotal = 1789.0;
            percentualEconomizar = 0.10;
        } else if (opcao == 3) {
            valorTotal = 68000.0;
            percentualEconomizar = 0.02;
        } else if (opcao == 4) {
            valorTotal = 180000.0;
            percentualEconomizar = 0.01;
        } else {
            System.out.println("Opcao invalida.");
            return;
        }

        double valorEconomizadoPorMes = valorTotal * percentualEconomizar;
        
        DecimalFormat df = new DecimalFormat("#.00");
        String valorEconomizadoPorMesFormatado = "R$ " + df.format(valorEconomizadoPorMes);

        int quantidadeMeses = (int) Math.ceil(valorTotal / valorEconomizadoPorMes);

        System.out.println("Para comprar o item escolhido, voce precisa economizar " + valorEconomizadoPorMesFormatado + " por " + quantidadeMeses + " meses.");

        scanner.close();
    }
}
