package br.com.simplesmente.bean;

import br.com.simplesmente.entidade.Produto;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mauricio.victor.carvalho@gmail.com
 */
@ManagedBean
@SessionScoped
public class BeanDoProduto {

    private List<Produto> listadeprodutos;
    private Produto produtoatual;

    public BeanDoProduto() {

        listadeprodutos = Arrays.asList(
                new Produto("Dvd Simplesmente vol.01", (float) 10.50),
                new Produto("Dvd Simplesmente vol.02 (Continua...)", (float) 12.0),
                new Produto("Dvd Simplesmente vol.03 (Sintonia)", (float) 15.0),
                new Produto("Dvd Simplesmente vol.03 (Persitência)", (float) 20.0),
                new Produto("Tênis Colab Öus/Simplesmente skate", (float) 230.90),
                new Produto("Camiseta Simplesmente skate vol.04 (Persistência) - cor Preta", (float) 50.0),
                new Produto("Camiseta Simplesmente skate vol.04 (Persistência) - cor Branca", (float) 50.0));
        produtoatual = new Produto();

    }

    public void setProdutoatual(Produto produtoatual) {
        this.produtoatual = produtoatual;
    }

    public List<Produto> getListadeprodutos() {
        return listadeprodutos;
    }

    public Produto getProdutoatual() {
        return produtoatual;
    }

    public String updateProduto() {
        produtoatual.setDescricao(produtoatual.getDescricao());
        produtoatual.setPreco(produtoatual.getPreco());
        return ("/Web-content/produto/produtotabela");
    }

    public String adicionarProduto() {
        listadeprodutos.add(produtoatual);
        produtoatual = new Produto();
        return ("/Web-content/produto/produtotabela");
    }

    public String removerProduto() {
        listadeprodutos.remove(produtoatual);
        return ("/Web-content/produto/produtotabela");
    }

    public void limparProduto() {
        this.produtoatual.setDescricao("");
        this.produtoatual.setPreco((float) 0.0);
    }

}
