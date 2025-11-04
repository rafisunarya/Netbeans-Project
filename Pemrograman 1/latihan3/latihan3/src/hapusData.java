import java.sql.Connection;
import java.sql.PreparedStatement;

public class hapusData {
    public static void main(String[] args) {
        try{
            Connection conn = koneksi.getConnection();
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.executeUpdate();
            System.out.println("Data berhasil dihapus!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
