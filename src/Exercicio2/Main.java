// TODO: 30/06/2023  Crie um programa para gerenciar uma lista de candidatos de um vestibular, cada candidato
//  tem número de matrícula e uma nota. No final do programa, o usuário deve decidir se irá adicionar mais de um
//  candidato, exibir todos os candidatos cadastrados ou excluir um candidato pelo número de matrícula.
package Exercicio2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorCandidatos gerenciador = new GerenciadorCandidatos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Adicionar Candidato");
            System.out.println("2 - Exibir Candidatos");
            System.out.println("3 - Excluir Candidato");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o número da matrícula:");
                int matricula = scanner.nextInt();

                System.out.println("Digite a nota:");
                double nota = scanner.nextDouble();

                gerenciador.adicionarCandidato(matricula, nota);
            } else if (opcao == 2) {
                gerenciador.exibirCandidatos();
            } else if (opcao == 3) {
                System.out.println("Digite o número da matrícula do candidato que deseja excluir:");
                int matricula = scanner.nextInt();
            } else if  (opcao == 4){
                break;

            }
        }
    }

}
