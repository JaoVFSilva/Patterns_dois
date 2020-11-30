/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author joao_silva
 */
public class ChassiCart {
    private static ChassiCart instance;

    private ChassiCart() {
        System.out.println("criando !!");
    }

    public synchronized static ChassiCart getInstance() {
        if (instance == null) {
            instance = new ChassiCart();
        }
        return instance;
    }
}
