import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {
    private static Connection conn;

    public static Connection getConnection(){
        try{
            if (conn == null) {
                String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
                String user = "root";
                String pass = "";
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil!");                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
