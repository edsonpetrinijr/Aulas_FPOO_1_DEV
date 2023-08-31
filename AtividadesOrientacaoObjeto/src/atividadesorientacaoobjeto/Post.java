/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesorientacaoobjeto;

/**
 *
 * @author Aluno
 */
public class Post implements ClassificacaoPost {
    private String nomeDoUsuario;
    private String descricao;
    private int numeroDeLikes;
    private int numeroDeComentarios;
    
    private int estrelas;

    public Post(String nomeDoUsuario, String descricao, int numeroDeLikes, int numeroDeComentarios) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.descricao = descricao;
        this.numeroDeLikes = numeroDeLikes;
        this.numeroDeComentarios = numeroDeComentarios;
    }

    @Override
    public String toString() {
        return "Post{" + "nomeDoUsuario=" + nomeDoUsuario + ", descricao=" + descricao + ", numeroDeLikes=" + numeroDeLikes + ", numeroDeComentarios=" + numeroDeComentarios + ", estrelas=" + estrelas + '}';
    }
    
    @Override
    public void avaliarComoComum() {
        this.estrelas = 1;
    }

    @Override
    public void avaliarComoLegal() {
        this.estrelas = 3;
    }

    @Override
    public void avaliarComoSuperLegal() {
        this.estrelas = 5;
    }
}
