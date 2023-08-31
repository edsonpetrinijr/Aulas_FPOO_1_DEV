/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

/**
 *
 * @author Aluno
 */
public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
            return "Cliente{" + "nome=" + nome + '}';
        } else {
            return "Cliente{" + "nome=" + nome + ", email=" + email + '}';
        }
    }
    
    /**
     * Calcula o valor total da locação do filme
     * Regra para filmes comuns
     * @param quantidadeDeDias
     * @return 
     */
    public double calcularLocacao(int quantidadeDeDias) {
        return quantidadeDeDias * 3.99;
    }
    
    /**
     * Calcular o valor total da locação do filme
     * Regra para filmes novos
     * @param quantiadeDeDias
     * @param lancamento
     * @return 
     */
    public double calcularLocacao(int quantidadeDeDias, boolean lancamento) {
        return quantidadeDeDias * 6.99;
    }
}
