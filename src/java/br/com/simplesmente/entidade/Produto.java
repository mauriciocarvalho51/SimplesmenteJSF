package br.com.simplesmente.entidade;

/**
 *
 * @author mauricio.victor.carvalho@gmail.com
 */
public class Produto {

    public static int codprod = 0;
    private int id;
    private String descricao;
    private float preco;

    public Produto(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
        id = ++codprod;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
