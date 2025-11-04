import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class tampilData {
    public static void main (String[]args) {
        try{
            Connection conn = koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("nama") + " | " + rs.getString("jurusan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
