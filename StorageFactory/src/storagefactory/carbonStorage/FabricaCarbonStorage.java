/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storagefactory.carbonStorage;

import storagefactory.interfaces.FabricaDeStorage;
import storagefactory.interfaces.HardDrive;
import storagefactory.interfaces.SolidDrive;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class FabricaCarbonStorage implements FabricaDeStorage {

    @Override
    public HardDrive criarHDD() {
        return new XFCarbon500();
    }

    @Override
    public SolidDrive criarSSD() {
        return new XFDiamond3000();
    }
    
}
