package Exercicio1;

// TODO: 29/06/2023 Crie um programa para gerenciar uma lista de produtos de um estabelecimento,
//  cada produto tem um nome e um preço.
//  No final do programa, o usuário deve decidir se irá ADICIONAR mais de um produto,
//  EXIBIR todos os produtos cadastrados ou EXCLUIR um produto pelo nome.
public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();
        Menu menu = new Menu(gerenciador, gerenciador, gerenciador);
        menu.exibirMenu();
    }
}

