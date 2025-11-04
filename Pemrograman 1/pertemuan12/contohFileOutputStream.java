import java.io.*;

public class contohFileOutputStream {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Erroor: Tulis Nama File!");
        }

        byte data;
        FileOutputStream fout=null;

        try{
            fout = new FileOutputStream(args[0]);
            System.out.println("Ketikkan data yang ingin anda tulis ke file. Ketik \"Q\" untuk mengakhiril");
            data = (byte)System.in.read();

            while (data != (byte) 'Q'){
                fout.write(data);
                data = (byte) System.in.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File: " + args[0] + "Tidak dapat dibuka atau dibuat.");
        } catch (IOException e) {
            System.out.println("Ekspresi tidak di ketahui: " + e);
        } finally {
            if (fout != null) {
                try{
                    fout.close();
                } catch (IOException err){
                    System.out.println("Ekspresi tidak diketahui: " + err);
                }
            }
        }
    }
}