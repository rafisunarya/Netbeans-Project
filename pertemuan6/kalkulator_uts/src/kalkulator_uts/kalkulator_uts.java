/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_uts;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author RAFIS
 */
public class kalkulator_uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TUGAS UTS KALKULATOR SEDERHANA");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian   (X)");
        System.out.println("4. Pembagian   (/)");
        System.out.print("Pilih operasi (1-4): ");

        int pilihan = 0;
        try {
            pilihan = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Inputannya gak valid nih!");
            return;
        }

        double angka1 = 0, angka2 = 0;

        try {
            System.out.print("Masukkan angka pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua   : ");
            angka2 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Yang di input gak valid!");
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
                    System.out.println("Pembagian dengan nol tidak diperbolehkan!");
                    valid = false;
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + hasil);
        }

        input.close();
    }