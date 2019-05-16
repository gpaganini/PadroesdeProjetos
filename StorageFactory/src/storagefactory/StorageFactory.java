/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storagefactory;

import storagefactory.carbonStorage.FabricaCarbonStorage;
import storagefactory.interfaces.FabricaDeStorage;
import storagefactory.interfaces.HardDrive;
import storagefactory.interfaces.SolidDrive;
import storagefactory.rapidFlash.FabricaRapidFlash;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class StorageFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeStorage stg = new FabricaRapidFlash();
        HardDrive hdd = stg.criarHDD();
        SolidDrive ssd = stg.criarSSD();        
        
        hdd.exibirInfoHardDrive();
        System.out.println();
        ssd.exibirInfoSolidDrive();
        System.out.println();
        
        stg = new FabricaCarbonStorage();
        hdd = stg.criarHDD();
        ssd = stg.criarSSD();
        
        hdd.exibirInfoHardDrive();
        System.out.println();
        ssd.exibirInfoSolidDrive();
        System.out.println();
    }
    
}
