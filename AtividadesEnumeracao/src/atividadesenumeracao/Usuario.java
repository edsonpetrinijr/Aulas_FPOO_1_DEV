/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesenumeracao;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String nome;
    
    private String aniversario;
    private String categoriaLivroFavorita;
    private String categoriaComidaFavorita;
    private String categoriaRedeSocialFavorita;

    public Usuario(
            String nome,
            
            String aniversario,
            String categoriaLivroFavorita,
            String categoriaComidaFavorita,
            String categoriaRedeSocialFavorita
    ) {
        this.nome = nome;
        
        this.aniversario = aniversario;
        this.categoriaLivroFavorita = categoriaLivroFavorita;
        this.categoriaComidaFavorita = categoriaComidaFavorita;
        this.categoriaRedeSocialFavorita = categoriaRedeSocialFavorita;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", aniversario=" + aniversario + ", categoriaLivroFavorita=" + categoriaLivroFavorita + ", categoriaComidaFavorita=" + categoriaComidaFavorita + ", categoriaRedeSocialFavorita=" + categoriaRedeSocialFavorita + '}';
    }
}
