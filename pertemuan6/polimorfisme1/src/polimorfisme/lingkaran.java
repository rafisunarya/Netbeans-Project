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
public class lingkaran extends bangundatar {
    float r;
    final float phi = 3.14f;

    public lingkaran(float r) {
        this.r = r;
    }

    @Override
    float luas() {
        return phi * r * r;
    }

    @Override
    float keliling() {
        return 2 * phi * r;
    }
}
