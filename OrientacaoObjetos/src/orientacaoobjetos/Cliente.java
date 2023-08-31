/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

/**
 *
 * @author Aluno
 */
public class Cliente implements AluguelFilme, CadastroCliente {
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
        return quantidadeDeDias * VALOR_FILME_SIMPLES;
    }
    
    /**
     * Calcular o valor total da locação do filme
     * Regra para filmes novos
     * @param quantidadeDeDias
     * @param lancamento
     * @return 
     */
    public double calcularLocacao(int quantidadeDeDias, boolean lancamento) {
        return quantidadeDeDias * VALOR_FILME_LANCAMENTO;
    }

    @Override
    public boolean validarNomeCompleto() {
        String[] partesDoNome = this.nome.split(" ");
        
        if (partesDoNome.length > 2) {
            System.out.println("O nome '" + nome + "' é válído");
            return true;
        } else {
            System.out.println("O nome '" + nome + "' do cliente é inválído. Coloque o nome completo");
            return false;
        }
    }

    @Override
    public boolean verificarEmailDominioGoogle() {
        if (this.email == null) {
            return false;
        }
        
        if (this.email.contains("@gmail.com")) {
            System.out.println("O e-mail " + " é do Google");
            return true;
        } else {
            System.out.println("O e-mail " + " não é do Google");
            return false;
        }
    }
}
