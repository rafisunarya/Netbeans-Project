import java.util.Scanner;

public class arrayMultiD {
    
   public static void main(String[] args) {
    String[][] bangku = new String[3][3];

    try (Scanner scan = new Scanner(System.in)) {
        for (int bar = 0; bar < bangku.length; bar++) {
            for (int kol = 0; kol < bangku[bar].length; kol++) {
                System.out.format("Acara reuni SMA yang akan hadir adalah (%d,%d): ", bar, kol);
                bangku[bar][kol] = scan.nextLine();
            }
        }

        System.out.println("===============================");
        for (int bar = 0; bar < bangku.length; bar++) {
            for (int kol = 0; kol < bangku[bar].length; kol++) {
                System.out.format("| %s |\t", bangku[bar][kol]);
            }
            System.out.println();
        }
        System.out.println("===============================");
        }
    }
}
