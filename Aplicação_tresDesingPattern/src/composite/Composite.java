/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author joao_silva
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peca carburador = new PecaSimples("carburador",300.0);
//        System.out.println(xampu.getDescricao());
        Peca coxim = new PecaSimples("coxim",45.0);
//        System.out.println(condicionador.getDescricao());
        
        Peca kit = new pecaComposta(carburador,coxim,345.0);
//        System.out.println(kit.getDescricao());
        
//        Produto cesta = new ProdutoComposto(kit, xampu);
//        System.out.println(cesta.getDescricao());
        CupomFiscal cupomFiscal = new CupomFiscal();
        cupomFiscal.addItem(carburador);
        cupomFiscal.addItem(coxim);
        cupomFiscal.addItem(kit);
        cupomFiscal.imprimeCupom();
        
        
    }
}
