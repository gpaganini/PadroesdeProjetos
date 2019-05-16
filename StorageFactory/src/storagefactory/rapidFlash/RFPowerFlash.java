/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storagefactory.rapidFlash;

import storagefactory.interfaces.SolidDrive;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class RFPowerFlash implements SolidDrive {

    @Override
    public void exibirInfoSolidDrive() {
        System.out.println("Rapid Flash\n Power Flash SSD\n Ultra 500MB/s Performance\n 2TB Storage Capacity");
    }
    
}
