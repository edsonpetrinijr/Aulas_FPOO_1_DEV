package Atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoPrecoAlmoco {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha o prato desejado:");
        System.out.println("1. Arroz, feijao, bife acebolado (R$ 19,99)");
        System.out.println("2. Arroz, feijao, file de frango (R$ 18,99)");
        System.out.println("3. Arroz, feijao, brajola (R$ 23,99)");
        
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();
        
        System.out.print("Quantidade de pratos: ");
        int quantidade = scanner.nextInt();
        
        double precoTotal = 0.0;
        
        switch (opcao) {
            case 1:
                precoTotal = 19.99 * quantidade;
                break;
            case 2:
                precoTotal = 18.99 * quantidade;
                break;
            case 3:
                precoTotal = 23.99 * quantidade;
                break;
            default:
                System.out.println("Opcao invalida");
                return;
        }
        
        DecimalFormat df = new DecimalFormat("#.00");
        String precoFormatado = df.format(precoTotal);
        
        System.out.println("Preco total para " + quantidade + " prato(s): R$ " + precoFormatado);
        
        scanner.close();
    }
}
