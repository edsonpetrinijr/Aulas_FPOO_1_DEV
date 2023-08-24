/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesclasses;

/**
 *
 * @author Aluno
 */
public class Curso {

    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private int vagasDisponiveis;
    private int inscricoesRealizadas;

    public Curso() {
    }

    public Curso(String nome, String descricao, CategoriaEnum categoria, int vagasDisponiveis) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.vagasDisponiveis = vagasDisponiveis;
        this.inscricoesRealizadas = 0;
    }

    public void realizarInscricao() {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
            inscricoesRealizadas++;
            System.out.println("Inscricao realizada com sucesso.");
        } else {
            System.out.println("Vagas esgotadas para este curso.");
        }
    }

    public void cancelarInscricao() {
        if (inscricoesRealizadas > 0) {
            vagasDisponiveis++;
            inscricoesRealizadas--;
            System.out.println("Inscricao cancelada com sucesso.");
        } else {
            System.out.println("Nenhuma inscricao para cancelar.");
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", vagasDisponiveis=" + vagasDisponiveis + ", inscricoesRealizadas=" + inscricoesRealizadas + '}';
    }
}
