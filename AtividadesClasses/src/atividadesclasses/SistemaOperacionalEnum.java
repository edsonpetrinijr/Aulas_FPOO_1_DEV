/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesclasses;

/**
 *
 * @author Aluno
 */
public enum SistemaOperacionalEnum {
    WINDOWS("Windows"),
    LINUX("Linux"),
    MACOS("MacOS");
    
    String sistemaOperacioal;

    private SistemaOperacionalEnum(String sistemaOperacioal) {
        this.sistemaOperacioal = sistemaOperacioal;
    }
}
