/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesenumeracao;

/**
 *
 * @author Aluno
 */
public enum CategoriaComidaEnum {
    SALGADOS("Salgados"),
    DOCES_ARTESANAIS("Doces Artesanais"),
    DOCES_INDUSTRIALIZADOS("Doces Industrializados"),
    BEBIDAS("Bebidas"),
    PRATO_FEITO("Prato Feito"),
    FRUTAS("Frutas"),
    LANCHES("Lanches"),
    BALAS("Balas");
    
    private String categoriaComida;

    private CategoriaComidaEnum(String categoriaComida) {
        this.categoriaComida = categoriaComida;
    }

    public String getCategoriaComida() {
        return this.categoriaComida;
    }
}
