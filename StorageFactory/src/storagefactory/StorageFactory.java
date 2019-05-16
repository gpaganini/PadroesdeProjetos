package storagefactory;

import java.util.Scanner;
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

    public static void main(String[] args) {
        
        String restart;
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== WELCOME TO PAGAN STORAGES ====\n");
        System.out.println("==== CHOOSE YOUR PREFERRED BRAND ====\n");
        System.out.println("[1] Rapid Flash Storages"
                + " [2] Carbon Storages:\n");        
        
        int choice = input.nextInt();
        
            FabricaDeStorage stg = new FabricaRapidFlash();
            HardDrive hdd = stg.criarHDD();
            SolidDrive ssd = stg.criarSSD();
        
        if (choice == 1) {
            Scanner rfdrive = new Scanner(System.in);
            System.out.println("Choose your Rapid Flash Storage:\n");
            System.out.println("[1]RF Power Drive"
                    + " [2]RF Power Flash\n");
            int rf = rfdrive.nextInt();
            
            if (rf == 1) {
                hdd.exibirInfoHardDrive();
                System.out.println();                
            } else if (rf == 2) {
                ssd.exibirInfoSolidDrive();
                System.out.println();
            } else {
                System.out.println("You did not selected any option!");
            }
            
        } else if (choice == 2) {
            Scanner carbondrive = new Scanner(System.in);
            System.out.println("Choose your Carbon Storage:\n");
            System.out.println("[1]XF Carbon500"
                    + " [2]XF Diamond3000\n");
            int xfcarbon = carbondrive.nextInt();
            
            stg = new FabricaCarbonStorage();
            if (xfcarbon == 1) {
                hdd = stg.criarHDD();
                hdd.exibirInfoHardDrive();
                System.out.println();
            } else if (xfcarbon == 2) {
                ssd = stg.criarSSD();
                ssd.exibirInfoSolidDrive();
                System.out.println();
            } else {
                System.out.println("You did not selected any option!");
            }            
        } else {
            System.out.println("You did not selected any option!");
        }
        
        System.out.println("Again? [Y] / [N] \n");
        restart = input.next();
        
        if (restart.equals("y") || restart.equals("Y")) {
            main(args);
        } else {
            System.exit(0);
        }
    }
}
