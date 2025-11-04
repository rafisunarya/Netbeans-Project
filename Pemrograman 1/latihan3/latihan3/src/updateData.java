import java.sql.Connection;
import java.sql.PreparedStatement;

public class updateData {
    public static void main(String[] args) {
        try{
            Connection conn = koneksi.getConnection();
            String sql = "UPDATE mahasiswa SET jurusan =? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Sistem Informasi");
            ps.setInt(2, 1);
            ps.executeUpdate();
            System.out.println("Data Berhasil Diupdate!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
