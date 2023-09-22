/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas2;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade, String cpf) {
        super(nome, email, idade, cpf);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }

    public boolean isDedicacaoExclusiva() {
        return dedicacaoExclusiva;
    }
}
