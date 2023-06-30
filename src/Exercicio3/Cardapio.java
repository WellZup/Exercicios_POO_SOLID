// TODO: 30/06/2023  . Crie um programa para gerenciar o cardápio de um restaurante. Cada prato tem um nome e pode
//  conter diversos ingredientes. No final do programa, o usuário deve decidir se irá adicionar mais de um prato,
//  exibir todos os pratos cadastrados ou excluir um prato pelo nome.
package Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pratos = new ArrayList<String>();
        ArrayList<String> ingredientes = new ArrayList<String>();
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1 - Adicionar prato");
            System.out.println("2 - Exibir todos os pratos");
            System.out.println("3 - Excluir prato");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do prato: ");
                    String nomePrato = scanner.nextLine();
                    System.out.print("Digite os ingredientes do prato (separados por vírgula): ");
                    String ingredientesPrato = scanner.nextLine();
                    pratos.add(nomePrato);
                    ingredientes.add(ingredientesPrato);
                    break;
                case 2:
                    for (int i = 0; i < pratos.size(); i++) {
                        System.out.println(pratos.get(i) + " - " + ingredientes.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do prato que deseja excluir: ");
                    String nomePratoExcluir = scanner.nextLine();
                    int indexPratoExcluir = pratos.indexOf(nomePratoExcluir);
                    if (indexPratoExcluir != -1) {
                        pratos.remove(indexPratoExcluir);
                        ingredientes.remove(indexPratoExcluir);
                        System.out.println("Prato excluído com sucesso!");
                    } else {
                        System.out.println("Prato não encontrado.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
