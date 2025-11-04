/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatorSetterGetter;

/**
 *
 * @author RAFIS
 */
public class Rafi {
    public static void main (String[]args){
        Manusia manusia = new Manusia();
        
        manusia.setNama("Muhammad Rafi Sunarya");
        manusia.setNoktp(123456);
        manusia.setAlamat("Cipondoh");
        manusia.setTtl("Jakarta, 08 Mei 2000");
        manusia.setUmur(25);
        manusia.setTinggi(172);
        
        System.out.println("Nama: " + manusia.getNama());
        System.out.println("No KTP: " + manusia.getNoktp());
        System.out.println("Alamat: " + manusia.getAlamat());
        System.out.println("Tempat Tanggal Lahir: " + manusia.getTtl());
        System.out.println("Umur: " + manusia.getUmur());
        System.out.println("Tinggi: " + manusia.getTinggi());
    }
}
