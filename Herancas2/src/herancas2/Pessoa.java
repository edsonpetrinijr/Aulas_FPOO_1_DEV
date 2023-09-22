/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas2;

/**
 *
 * @author Aluno
 */
public class Pessoa implements ValidaPessoa {
    private String nome;
    private String email;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String email, int idade, String cpf) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }

    public boolean verificarMaiorDeIdade() {
        return this.idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", idade=" + idade + ", cpf=" + cpf + '}';
    }

    @Override
    public boolean verificarDominioEmailGmail() {
        return this.email.contains("@gmail.com");
    }

    @Override
    public boolean verificarDominioEmailYahoo() {
        return this.email.contains("@yahoo.com");
    }
}
