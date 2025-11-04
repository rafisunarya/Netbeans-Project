/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RAFIS
 */
public class mainbangundatar {
     public static void main(String[] args) {
        persegi p = new persegi();
        p.sisi = 5;

        persegipanjang pp = new persegipanjang();
        pp.panjang = 8;
        pp.lebar = 4;

        lingkaran l = new lingkaran();
        l.r = 7;

        System.out.println("===== HASIL PERHITUNGAN BANGUN DATAR =====");
        System.out.println("Persegi: Luas = " + p.luas() + ", Keliling = " + p.keliling());
        System.out.println("Persegi Panjang: Luas = " + pp.luas() + ", Keliling = " + pp.keliling());
        System.out.println("Lingkaran: Luas = " + l.luas() + ", Keliling = " + l.keliling());
    }
}
