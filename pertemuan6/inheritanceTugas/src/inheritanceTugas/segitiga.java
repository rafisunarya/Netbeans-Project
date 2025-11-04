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
public class segitiga extends bangundatar {
    double alas;
    double tinggi;

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        // asumsikan segitiga sama sisi untuk contoh sederhana
        return 3 * alas;
    }
}
