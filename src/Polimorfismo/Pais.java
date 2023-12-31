package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private double populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    // Métodos de acesso (getter/setter)
    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    // Verifica se outro país é vizinho do país atual
    public boolean ehVizinho(Pais outroPais) {
        return fronteiras.contains(outroPais);
    }

    // Calcula a densidade populacional do país
    public double calcularDensidadePopulacional() {
        return populacao / dimensao;
    }

    // Adiciona um país como vizinho do país atual
    public void adicionarVizinho(Pais paisVizinho) {
        fronteiras.add(paisVizinho);
    }
}