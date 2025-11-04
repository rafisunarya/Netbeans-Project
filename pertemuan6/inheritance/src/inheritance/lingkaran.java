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
    float r;
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: 3,14 x "+r+" x "+r+" = "+luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: 2 x 3,14 x "+r+" = "+keliling);
        return keliling;
    }
}
