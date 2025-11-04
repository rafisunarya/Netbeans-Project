/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author RAFIS
 */
public class Game {
    public static void main (String [] args) {
        PLay galuh = new PLay();
        
        galuh.name = "Galuh Saputri";
        galuh.speed = 70;
        galuh.healthPoint = 0;
        
        galuh.run();
        
        if(galuh.isDead()){
            System.out.println("Permainan berakhir!");
        }
    }
}
