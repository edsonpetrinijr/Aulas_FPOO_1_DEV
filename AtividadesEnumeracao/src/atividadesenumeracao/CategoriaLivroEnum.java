/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesenumeracao;

/**
 *
 * @author Aluno
 */
public enum CategoriaLivroEnum {
    ROMANCE("Romance"),
    SUSPENSE("Suspense"),
    COMEDIA("Comedia"),
    TECNICO("Tecnico"),
    FICCAO_CIENTIFICA("Ficcao Cientifica");
    
    private String categoriaLivro;

    private CategoriaLivroEnum(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public String getCategoriaLivro() {
        return this.categoriaLivro;
    }
}
