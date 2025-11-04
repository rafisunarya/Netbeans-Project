/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatorSetterGetter;

/**
 *
 * @author RAFIS
 */
public class Manusia {
        private String nama;
        private int noktp;
        private String alamat;
        private String ttl;
        private int umur;
        private float tinggi;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getNoktp() {
            return noktp;
        }

        public void setNoktp(int noktp) {
            this.noktp = noktp;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getTtl() {
            return ttl;
        }

        public void setTtl(String ttl) {
            this.ttl = ttl;
        }

        public int getUmur() {
            return umur;
        }

        public void setUmur(int umur) {
            this.umur = umur;
        }

        public float getTinggi() {
            return tinggi;
        }

        public void setTinggi(float tinggi) {
            this.tinggi = tinggi;
        }
        
    }
