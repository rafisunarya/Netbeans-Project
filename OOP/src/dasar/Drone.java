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
public class Drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang () {
        energi--;
        if(energi > 10){
            ketinggian++;
            System.out.println("Drone terbang....");
        } else{
            System.out.println("Battery Low! Drone tidak bisa terbang");
        }
    }
    void matikanMesin(){
        if(ketinggian > 1){
            System.out.println("Mesin tidak bisa di matikan, karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }
    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }
    void belok(){
        energi--;
        System.out.println("Drone bermanufer");
    }
    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }
    void mundur(){
        energi--;
        System.out.println("Drone bergerak mundur");
        kecepatan++;
    }
}
