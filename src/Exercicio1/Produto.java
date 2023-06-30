package Exercicio1;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

interface AdicionarProduto {
    void adicionarProduto(String nome, double preco);
}

interface ExibirProdutos {
    void exibirProdutos();
}

interface ExcluirProduto {
    void excluirProduto(String nome);
}

