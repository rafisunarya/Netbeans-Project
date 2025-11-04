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
public class MainDrone {
    public static void main(String[]args){
        Drone drone = new Drone();
        
        drone.energi = 15;
        drone.ketinggian = 15;
        drone.kecepatan = 31;
        drone.merek = "Fujifilm";
        
        drone.terbang();
        drone.matikanMesin();
        drone.turun();
        drone.belok();
        drone.maju();
        drone.mundur();
    }
}
