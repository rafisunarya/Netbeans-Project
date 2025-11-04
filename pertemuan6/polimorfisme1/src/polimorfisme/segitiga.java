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
public class segitiga extends bangundatar {
    float alas, tinggi;

    public segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    float keliling() {
        // contoh sederhana: misal segitiga sama sisi
        return 3 * alas;
    }
}
