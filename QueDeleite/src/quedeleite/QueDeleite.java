/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quedeleite;

import quedeleite.Biscoiteria.BiscoiteriaFactory;
import quedeleite.Biscoiteria.BiscoitosVovo;
import quedeleite.Biscoiteria.Doce;
import quedeleite.Biscoiteria.Salgado;
import quedeleite.Boloteria.Bolo;
import quedeleite.Boloteria.BoloCasamento;
import quedeleite.Boloteria.BoloFesta;
import quedeleite.Boloteria.BoloteriaFactory;
import quedeleite.Doceteria.DoceteriaPrototype;
import quedeleite.Doceteria.Pacoca;
import quedeleite.Doceteria.Suspiro;



/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class QueDeleite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ///BISCOITERIA
        BiscoiteriaFactory biscoito = new BiscoitosVovo();
        Doce doce = biscoito.biscoitoDoce();
        Salgado salgado = biscoito.biscoidoSalgado();             
        
        doce.exibirInfoBiscoitoDoce();
        System.out.println();
        salgado.exibirInfoBiscoitoSalgado();
        System.out.println();
        
        
        ///BOLOTERIA
        BoloteriaFactory boloteria = new BoloCasamento();
        Bolo bolo = boloteria.criarBolo();
        bolo.exibirInfo();
        System.out.println();
        
        boloteria = new BoloFesta();
        bolo = boloteria.criarBolo();
        bolo.exibirInfo();
        System.out.println();
        
        
        ///DOCETERIA
        Suspiro suspiroPrototipo = new Suspiro(); 
        DoceteriaPrototype suspiro = suspiroPrototipo.clonar();
        suspiro.setValorCompra(1.99);
        
        Pacoca pacocaPrototipo = new Pacoca();
        DoceteriaPrototype pacoca = pacocaPrototipo.clonar();
        pacoca.setValorCompra(0.25);
        
        System.out.println(suspiro.exibirInfo());
        System.out.println(pacoca.exibirInfo());
        
        
    }
    
}
