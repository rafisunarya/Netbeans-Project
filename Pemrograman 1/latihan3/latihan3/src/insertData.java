import java.sql.Connection;
import java.sql.PreparedStatement;

public class insertData {
    public static void main (String[] args){
        try{
            Connection conn = koneksi.getConnection();
            String sql = "INSERT INTO mahasiswa (nama, jurusan) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Andi");
            ps.setString(2, "Informatika");
            ps.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
