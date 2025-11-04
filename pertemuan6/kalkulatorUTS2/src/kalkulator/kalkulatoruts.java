/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author RAFIS
 */
public class kalkulatoruts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR JAVA SEDERHANA ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih operasi (1-4): ");

        int pilihan = 0;
        try {
            pilihan = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("❌ Input tidak valid! Harap masukkan angka 1-4.");
            return; // keluar dari program
        }

        double angka1 = 0, angka2 = 0;

        try {
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("❌ Input bukan angka valid!");
            return;
        }

        double hasil = 0;
        boolean valid = true;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 == 0) {
                    System.out.println("❌ Error: Pembagian dengan nol tidak diperbolehkan!");
                    valid = false;
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                System.out.println("❌ Pilihan tidak valid!");
                valid = false;
        }

        if (valid) {
            System.out.println("👉 Hasil: " + hasil);
        }

        input.close();
    }