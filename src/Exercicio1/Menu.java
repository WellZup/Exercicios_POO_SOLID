package Exercicio1;

import java.util.Scanner;

class Menu {
    private AdicionarProduto adicionarProduto;
    private ExibirProdutos exibirProdutos;
    private ExcluirProduto excluirProduto;
    private Scanner scanner;

    public Menu(AdicionarProduto adicionarProduto, ExibirProdutos exibirProdutos, ExcluirProduto excluirProduto) {
        this.adicionarProduto = adicionarProduto;
        this.exibirProdutos = exibirProdutos;
        this.excluirProduto = excluirProduto;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean executar = true;

        while (executar) {
            System.out.println("=== Gerenciador de Produtos ===");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Exibir Produtos");
            System.out.println("3 - Excluir Produto");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    exibirProdutos();
                    break;
                case 3:
                    excluirProduto();
                    break;
                case 4:
                    executar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        }
    }

    private void adicionarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        if (nome.isEmpty()){
            System.out.println("O nome do produto não pode ser vazio.");
        } else if (!nome.matches("[a-zA-Z]+")) {
            System.out.println("O nome do produto deve conter apenas letras.");
        } else {
            System.out.println();
        }

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        adicionarProduto.adicionarProduto(nome, preco);
    }

    private void exibirProdutos() {
        exibirProdutos.exibirProdutos();
    }

    private void excluirProduto() {
        System.out.print("Digite o nome do produto que deseja excluir: ");
        String nome = scanner.nextLine();

        excluirProduto.excluirProduto(nome);
    }
}
