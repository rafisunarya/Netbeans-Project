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
public class PLay {
    String name;
    int speed;
    int healthPoint;
    
    void run() {
        System.out.println(name + "Sedang Berjalan");
        System.out.println("Kecepatan: " + speed);
    }
    
    boolean isDead() {
        if(healthPoint <= 0) return true;
        return false;
    }
    
}
