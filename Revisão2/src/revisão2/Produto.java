/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão2;

/**
 *
 * @author Aluno
 */
public class Produto {
    private String nome;
    private int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }
    
    
}
