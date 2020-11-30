/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao_silva
 */
public class CupomFiscal {
    
    List<Peca> itens = new ArrayList<>();
    public void addItem(Peca item){
        itens.add(item);
    }
    public void imprimeCupom(){
        for(Peca p:itens){
            System.out.println(p.getDescricao()+" - "+p.getPreco());
        }
    }
    
}
