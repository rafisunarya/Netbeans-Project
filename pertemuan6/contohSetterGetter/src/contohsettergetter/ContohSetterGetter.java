/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohsettergetter;

/**
 *
 * @author RAFIS
 */
public class ContohSetterGetter {

    private String nama;
    private int umur;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContohSetterGetter orang = new ContohSetterGetter();
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public String getNama(){
        return this.nama;
    }
    public int getUmur(){
        return this.umur;
    }
    
}
