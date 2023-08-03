package Atividade2;

import java.util.Scanner;

class CalculadoraCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nomeProduto, valorProduto, quantidade);

        System.out.print("Forma de pagamento (D para debito, C para credito): ");
        char formaPagamento = scanner.next().charAt(0);
       
        if (formaPagamento == 'D') {
            double valorTotal = produto.calcularValorTotal();
            if (valorTotal <= 100) {
                valorTotal *= 0.95;
            } else {
                valorTotal *= 0.97;
            }
            
            System.out.println("");
            System.out.println("Valor total com desconto: R$ " + valorTotal);
        }

        if (formaPagamento == 'C') {
            System.out.print("Digite o numero de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            double valorTotal = produto.calcularValorTotal();
            double valorParcela = valorTotal / numeroParcelas;
            
            System.out.println("");
            System.out.println("Valor da parcela: R$ " + valorParcela);
        }

        System.out.println("Produto: " + produto.nome);
        System.out.println("Valor unitario: R$ " + produto.valor);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor total: R$ " + produto.calcularValorTotal());

        scanner.close();
    }
}
