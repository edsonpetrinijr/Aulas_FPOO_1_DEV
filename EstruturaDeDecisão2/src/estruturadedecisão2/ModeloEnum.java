/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedecisão2;

/**
 *
 * @author Aluno
 */
public enum ModeloEnum {
    BASICO("Básico"),
    SUPERFLEX("Superflex"),
    PREMIUM("Premium"),
    MASTER("Master");
    
    private String modelo;

    private ModeloEnum(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}
