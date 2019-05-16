/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storagefactory.rapidFlash;

import storagefactory.interfaces.HardDrive;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class RFPowerDrive implements HardDrive {

    @Override
    public void exibirInfoHardDrive() {
        System.out.println("Rapid Flash\n Power Drive HDD\n Ultra 15.000 RPM Performance\n 4TB Storage Capacity");
    }
    
}
