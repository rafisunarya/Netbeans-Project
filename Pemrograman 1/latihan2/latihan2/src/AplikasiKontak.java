import java.sql.*;
import java.util.Scanner;

public class AplikasiKontak {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args){
        int pilihan;
        
        do{
            System.out.println("\n===== Aplikasi Kontak =====");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Lihat Kontak");
            System.out.println("3. Update Kontak");
            System.out.println("4. Hapus Kontak");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                tambahKontak();
                case 2:
                lihatKontak();
                case 3:
                updateKontak();
                case 4:
                hapusKontak();
            }
        } while (pilihan != 5);
    }    

    private static void tambahKontak() {
        try (Connection conn = koneksi.getConnection()) {
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Nomor HP: ");
            String nomor = scanner.nextLine();

            String sql = "INSERT INTO kontak (nama, nomor_hp) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setString(2, nomor);
            stmt.executeUpdate();

            System.out.println("Kontak berhasil ditambahkan!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void lihatKontak() {
        try (Connection conn = koneksi.getConnection()) {
            String sql = "SELECT * FROM kontak";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nDaftar Kontak:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " +
                                   rs.getString("nama") + " - " +
                                   rs.getString("nomor_hp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateKontak() {
        try (Connection conn = koneksi.getConnection()) {
            System.out.print("Masukkan ID kontak yang mau diupdate: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nama baru: ");
            String nama = scanner.nextLine();
            System.out.print("Nomor HP baru: ");
            String nomor = scanner.nextLine();

            String sql = "UPDATE kontak SET nama=?, nomor_hp=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setString(2, nomor);
            stmt.setInt(3, id);
            stmt.executeUpdate();

            System.out.println("Kontak berhasil diperbarui!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void hapusKontak() {
        try (Connection conn = koneksi.getConnection()) {
            System.out.print("Masukkan ID kontak yang mau dihapus: ");
            int id = scanner.nextInt();

            String sql = "DELETE FROM kontak WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Kontak berhasil dihapus!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
