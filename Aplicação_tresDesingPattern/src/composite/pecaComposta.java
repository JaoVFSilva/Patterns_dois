/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author joao_silva
 */
public class pecaComposta implements Peca {
    
    Peca peca1;
    Peca peca2;
    Double preco;

    public pecaComposta(Peca produto1, Peca produto2, Double preco) {
        this.peca1 = peca1;
        this.peca2 = peca2;
        this.preco = preco;
    }

    
    @Override
    public String getDescricao() {
        return peca1.getDescricao() + " tambem leve "+peca2.getDescricao();
    }

    @Override
    public Double getPreco() {
        return this.preco;
        
                
    }
}
