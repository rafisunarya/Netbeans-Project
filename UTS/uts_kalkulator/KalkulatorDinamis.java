import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorDinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\n=== KALKULATOR JAVA ===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");

            int pilihan = 0;

            try {
                pilihan = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Input tidak valid! Harap masukkan angka 1-5.");
                input.nextLine(); // bersihkan buffer
                continue;
            }

            if (pilihan == 5) {
                System.out.println("Terima kasih sudah menggunakan kalkulator ini!");
                break;
            }

            double angka1 = 0, angka2 = 0;

            try {
                System.out.print("Masukkan angka pertama: ");
                angka1 = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                angka2 = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("❌ Input bukan angka valid!");
                input.nextLine(); // bersihkan buffer
                continue;
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

            System.out.print("\nIngin melanjutkan perhitungan lain? (y/n): ");
            String lanjutInput = input.next();
            lanjut = lanjutInput.equalsIgnoreCase("y");
        }

        input.close();
    }
}
