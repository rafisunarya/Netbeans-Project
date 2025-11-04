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
public class lingkaran extends bangundatar {
    double r;

    @Override
    double luas() {
        return Math.PI * r * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }
}
