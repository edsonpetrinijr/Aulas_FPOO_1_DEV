/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesclasses;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    TECNOLOGIA_DA_INFORMACAO("Tecnologia da Informação"),
    AUTOMACAO("Automação"),
    MECANICA("Mecânica"),
    ELETRICA("Elétrica"),
    CONSTRUCAO_CIVIL("Construção Civil"),
    ALIMENTACAO("Alimentação"),
    VESTUARIO("Vestuário");
    
    private String categoria;

    private CategoriaEnum(String categoria) {
        this.categoria = categoria;
    }
}
