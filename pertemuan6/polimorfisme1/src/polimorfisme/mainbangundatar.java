/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author RAFIS
 */
public class mainbangundatar {
    public static void main(String[] args) {
        bangundatar objbangundatar = new bangundatar();
        persegi objpersegi = new persegi(5);
        segitiga objsegitiga = new segitiga(4, 6);
        lingkaran objlingkaran = new lingkaran(10);

        objbangundatar.luas();
        objbangundatar.keliling();

        System.out.println("Luas persegi: " + objpersegi.luas());
        System.out.println("Keliling persegi: " + objpersegi.keliling());

        System.out.println("Luas segitiga: " + objsegitiga.luas());
        System.out.println("Keliling segitiga: " + objsegitiga.keliling());

        System.out.println("Luas lingkaran: " + objlingkaran.luas());
        System.out.println("Keliling lingkaran: " + objlingkaran.keliling());
    }
}
