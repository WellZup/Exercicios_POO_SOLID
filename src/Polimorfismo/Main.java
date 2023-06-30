 package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        Pais argentina = new Pais("ARG", "Argentina", 2780400.0);
        Pais paraguai = new Pais("PRY", "Paraguai", 406752.0);

        brasil.setPopulacao(193946886.0);
        brasil.adicionarVizinho(argentina);
        brasil.adicionarVizinho(paraguai);

        System.out.println("País: " + brasil.getNome());
        System.out.println("Código ISO: " + brasil.getCodigoISO());
        System.out.println("População: " + brasil.getPopulacao());
        System.out.println("Dimensão: " + brasil.getDimensao());
        System.out.println("Densidade populacional: " + brasil.calcularDensidadePopulacional());
        System.out.println("É vizinho da Argentina? " + brasil.ehVizinho(argentina));
        System.out.println("É vizinho do Paraguai? " + brasil.ehVizinho(paraguai));
    }

}
