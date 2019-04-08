/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quedeleite.Biscoiteria;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class BiscoitosMamae implements BiscoiteriaFactory {

    @Override
    public Salgado biscoidoSalgado() {
        return new BiscoitoQueijo();
    }

    @Override
    public Doce biscoitoDoce() {
        return new BiscoitoMel();
    }
    
}
