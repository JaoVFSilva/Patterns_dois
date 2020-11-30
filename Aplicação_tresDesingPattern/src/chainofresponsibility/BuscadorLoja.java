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
public class BuscadorLoja extends BuscadorPeça{

    @Override
    public Boolean busca() {
        System.out.println("buscando na loja local");
        return false;
    }
    
}
