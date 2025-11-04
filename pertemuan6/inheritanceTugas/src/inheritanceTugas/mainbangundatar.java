/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceTugas;

/**
 *
 * @author RAFIS
 */
public class mainbangundatar {
    public static void main(String[] args) {
        bangundatar b = new bangundatar();

        persegi p = new persegi();
        p.sisi = 5;

        persegipanjang pp = new persegipanjang();
        pp.panjang = 6;
        pp.lebar = 3;

        segitiga s = new segitiga();
        s.alas = 4;
        s.tinggi = 5;

        lingkaran l = new lingkaran();
        l.r = 7;

        System.out.println("LUAS & KELILING BANGUN DATAR");
        System.out.println("==============================");
        System.out.println("Persegi: Luas = " + p.luas() + ", Keliling = " + p.keliling());
        System.out.println("Persegi Panjang: Luas = " + pp.luas() + ", Keliling = " + pp.keliling());
        System.out.println("Segitiga: Luas = " + s.luas() + ", Keliling = " + s.keliling());
        System.out.println("Lingkaran: Luas = " + l.luas() + ", Keliling = " + l.keliling());
    }
}
