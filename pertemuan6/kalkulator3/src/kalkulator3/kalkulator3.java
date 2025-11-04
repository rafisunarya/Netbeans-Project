/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator3;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author RAFIS
 */
public class kalkulator3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian   (X)");
        System.out.println("4. Pembagian   (/)");
        System.out.print("Pilih operasi (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        double hasil = 0;

        if (pilihan == 1) {
            hasil = a + b;
        } else if (pilihan == 2) {
            hasil = a - b;
        } else if (pilihan == 3) {
            hasil = a * b;
        } else if (pilihan == 4) {
            if (b == 0) {
                System.out.println("Error: Tidak bisa membagi dengan nol!");
                input.close();
                return;
            }
            hasil = a / b;
        } else {
            System.out.println("Pilihan tidak valid!");
            input.close();
            return;
        }

        System.out.println("Hasil: " + hasil);
        input.close();
    }
}