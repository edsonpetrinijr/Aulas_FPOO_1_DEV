/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesenumeracao;

/**
 *
 * @author Aluno
 */
public enum CategoriaRedeSocialEnum {
    NOTICIAS("Noticias"),
    MENSAGENS("Mensagens"),
    VIDEOS_CURTOS("Videos Curtos");
    
    private String categoriaRedeSocial;

    private CategoriaRedeSocialEnum(String categoriaRedeSocial) {
        this.categoriaRedeSocial = categoriaRedeSocial;
    }

    public String getCategoriaRedeSocial() {
        return this.categoriaRedeSocial;
    }
}
