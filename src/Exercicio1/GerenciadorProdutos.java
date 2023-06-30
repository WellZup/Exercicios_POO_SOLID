package Exercicio1;

import java.util.ArrayList;
import java.util.List;

class GerenciadorProdutos implements AdicionarProduto, ExibirProdutos, ExcluirProduto {

    private List<Produto> produtos = new ArrayList<>();


    @Override
    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    @Override
    public void exibirProdutos() {

        System.out.println("Lista de produtos: ");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto: produtos) {

                System.out.println("Nome: " + produto.getNome());

            }
        }

    }

    @Override
    public void excluirProduto(String nome) {

        boolean encontrado = false;
        for (Produto produto: produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produto);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }

    }
}
      