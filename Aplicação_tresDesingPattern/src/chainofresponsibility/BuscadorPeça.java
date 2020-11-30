/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author joao_silva
 */
public abstract class BuscadorPeça {
    private BuscadorPeça proximo;
    public void setProximo(BuscadorPeça proximo) {
        this.proximo = proximo;
    }
    public abstract Boolean busca();
    public Boolean buscarEmCadeia(){
        if (busca()==true){
            return true; 
        }else if (proximo!= null){
            return proximo.buscarEmCadeia();
        }else{
            return false;
        }
    }
}
