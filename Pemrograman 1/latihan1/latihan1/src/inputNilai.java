import java.util.Scanner;

public class inputNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai Kamu: ");
        int nilai = input.nextInt();

        System.out.println("Ini Nilai yang kamu input " + nilai);

        if (nilai > 95) {
            System.out.println("Nilai Kamu Bagus!");            
        }else{
            System.out.println("Harus Belajar Lebih Giat Lagi!");
        }
    }
}
