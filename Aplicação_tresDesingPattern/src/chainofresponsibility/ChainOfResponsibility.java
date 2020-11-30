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
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuscadorPeça chainFree = new BuscadorLoja();
        BuscadorOLX rede = new BuscadorOLX();
        BuscadorPeça cloud = new BuscadorMercadoLivre();
        rede.setProximo(cloud);
        chainFree.setProximo(rede);
        
        BuscadorPeça chainPremium = new BuscadorLoja();
        chainPremium.setProximo(cloud);
        Boolean achei = chainPremium.buscarEmCadeia();
        System.out.println("Resultado:"+achei);
    }
    
}
