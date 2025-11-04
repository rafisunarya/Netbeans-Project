import java.io.*;

public class pernyataanifelse {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new
        InputStreamReader(System.in));

        String gradeString = "";
        Byte grade = 0;

        System.out.print("Masukkan Nilai Anda: ");

        try{
            gradeString = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Ada Kesalahan!");
        }
        grade = new Byte(gradeString);

        if (grade >= 80)
        System.out.println("Selamat Anda Lulus!");
        else System.out.println("Maff Anda Belum Lulus!");
    }
}
