package Exercicio2;

import java.util.ArrayList;

public class GerenciadorCandidatos {
    private ArrayList<Candidato> candidatos;

    public GerenciadorCandidatos() {
        candidatos = new ArrayList<Candidato>();
    }

    public void adicionarCandidato(int matricula, double nota) {
        Candidato candidato = new Candidato(matricula, nota);
        candidatos.add(candidato);
    }

    public void exibirCandidatos() {
        for (Candidato candidato : candidatos) {
            System.out.println("Matrícula: " + candidato.getMatricula() + ", Nota: " + candidato.getNota());
        }
    }

    public void excluirCandidato(int matricula) {
        for (int i = 0; i < candidatos.size(); i++) {
            if (candidatos.get(i).getMatricula() == matricula) {
                candidatos.remove(i);
                break;
            }
        }
    }
}
