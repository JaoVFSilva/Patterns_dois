/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import singleton.ChassiCart;

/**
 *
 * @author joao_silva
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChassiCart u = ChassiCart.getInstance();
        ChassiCart u2 = ChassiCart.getInstance();
        ChassiCart u3 = ChassiCart.getInstance();
        ChassiCart u4 = ChassiCart.getInstance();
        
    }
    
}
