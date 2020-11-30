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
public class BuscadorOLX extends BuscadorPeça{

    @Override
    public Boolean busca() {
        System.out.println("Buscando na OLX ...");
        return false;
    }
    
}
