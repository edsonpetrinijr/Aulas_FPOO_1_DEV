/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisão2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Revisão2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Produto arroz = new Produto("Arroz", 28);
        Produto feijao = new Produto("Feijão", 30);
        Produto cafe = new Produto("Café", 11);
        Produto macarrao = new Produto("Macarrão", 23);
        Produto farinhaDeTrigo = new Produto("Farinha de Trigo", 34);
        Produto ovos = new Produto("Ovos", 19);
        Produto carne = new Produto("Carne", 42);
        Produto frios = new Produto("Frios", 17);
        Produto produtoDeLimpeza = new Produto("Produtos de Limpeza", 30);
        Produto bolacha = new Produto("Bolacha", 8);

        Produto[] produtos = {
            arroz,
            feijao,
            cafe,
            macarrao,
            farinhaDeTrigo,
            ovos,
            carne,
            frios,
            produtoDeLimpeza,
            bolacha
        };

        System.out.println("Seja bem-vindo ao Delta Supermercados");
        System.out.println("Esses são alguns de nosso produtos");

        for (int i = 0; i < produtos.length; i++) {
            Produto produto = produtos[i];

            System.out.println((i + 1) + ". " + produto.getNome() + " - R$ " + produto.getPreco());
        }

        System.out.println("Selecione o produto que você gostaria de comprar:");
        Scanner scanner = new Scanner(System.in);
        int codigoDoProduto = scanner.nextInt();
        
        Produto produtoEscolhido = produtos[codigoDoProduto - 1];
        
        System.out.println("Quantas unidades de \"" + produtoEscolhido.getNome() + "\" você deseja?");
        int quantidade = scanner.nextInt();

       

        double precoTotal;
        if (produtoEscolhido.getPreco() * quantidade > 100) {
            System.out.println("O preço de sua compra ultrapassou R$ 100, você ganhou 2,5% de desconto!");
            
            double precoTotalSemDesconto = produtoEscolhido.getPreco() * quantidade;
            precoTotal = precoTotalSemDesconto - (precoTotalSemDesconto * 0.025);
        } else {
            precoTotal = produtoEscolhido.getPreco() * quantidade;
        }
        
        System.out.println("Preço total: R$ " + precoTotal);
    }

}
