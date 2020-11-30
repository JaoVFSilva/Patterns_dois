/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicação;
import chainofresponsibility.*;
import composite.*;
import singleton.*;
/**
 *
 * @author joao_silva
 */
public class Main {
     public static void main(String[] args) {
       
         BuscadorPeça buscador = new BuscadorOLX();
         buscador.buscarEmCadeia();
         
         Peca carburador = new PecaSimples("carburador",300.0);
         
          ChassiCart u = ChassiCart.getInstance();
    }
}
