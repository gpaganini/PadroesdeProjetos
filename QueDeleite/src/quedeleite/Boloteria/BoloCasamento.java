/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quedeleite.Boloteria;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class BoloCasamento implements BoloteriaFactory {

    @Override
    public Bolo criarBolo() {
        return new VeuDeNoiva();
    }
    
}
