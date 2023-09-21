/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas;

/**
 *
 * @author Aluno
 */
public enum CombustivelEnum {
    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    DIESEL("Diesel"),
    GNV("Gás Natural Veicular");
    
    private String tipoCombusitivel;

    private CombustivelEnum(String tipoCombusitivel) {
        this.tipoCombusitivel = tipoCombusitivel;
    }

    public String getTipoCombusitivel() {
        return tipoCombusitivel;
    }
}
