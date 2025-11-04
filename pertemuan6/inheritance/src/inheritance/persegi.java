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
public class persegi extends bangundatar {
    float sisi;
    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas persegi: "+sisi+" x "+sisi+" = "+luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling persegi: 4 x "+sisi+" = "+keliling);
        return keliling;
    }
}
