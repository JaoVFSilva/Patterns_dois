/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author joao_silva
 */
public class PecaSimples implements Peca{

    private String descricao;
    private Double preco;

    public PecaSimples(String descricao,Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }
    
}
