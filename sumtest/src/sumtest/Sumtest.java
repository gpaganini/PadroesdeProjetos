/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumtest;

/**
 *
 * @author giovani.paganini
 */
public class Sumtest {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        int sum = 0;       
        
        for (int i = 0; i < 1000; i++){
            if(i % x ==0){
                sum +=i;
            }
        }
        
        System.out.println(sum);
    }
    
}
