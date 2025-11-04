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
    public static void main (String [] args){
        bangundatar mBangunDatar = new bangundatar();
        
        persegi mPersegi = new persegi();
        mPersegi.sisi = 2;
        
        lingkaran mLingkaran = new lingkaran();
        mLingkaran.r = 22;
        
        persegipanjang mPersegiPanjang = new persegipanjang();
        mPersegiPanjang.panjang = 8;
        mPersegiPanjang.lebar = 4;
        
        segitiga mSegitiga = new segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        mBangunDatar.luas();
        mBangunDatar.keliling();
        mPersegi.luas();
        mPersegi.keliling();
        mLingkaran.luas();
        mLingkaran.keliling();
        mPersegiPanjang.luas();
        mPersegiPanjang.keliling();
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
