package hospitalsystemproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

    

    public static void main(String[] args) {
        HospitalSystemProject sistem = new HospitalSystemProject("ORDU", "123");
        Doktor d01 = new Doktor("Doktor01", " Hekim01", "44428298236", "Psikaytri");
        Doktor d02 = new Doktor("Doktor02", " Hekim02", "456456456456", "Dahiliye");

        //Doktor Ekleme:
        sistem.doktorEkle(d01);
        sistem.doktorEkle(d02);

        sistem.hastaEkle(d02, new Hasta("Emirhan", "ASLANKARAYIGIT", "44428298236"));
        sistem.hastaEkle(d02, new Hasta("Emine", "TOPAL", "35014611966"));
        sistem.hastaEkle(d02, new Hasta("Emin", "ASLAN", "22354687456"));

        HomePage hpage = new HomePage();

        GeneralClass gclass = new GeneralClass();
        gclass.hastaneler[0] = sistem;
        hpage.anasystem = gclass;
        hpage.setVisible(true);

    }
}
class PostgreSQLJDBCExample {

    private final String url = "jdbc:postgresql://localhost:5432/postgres [postgres on public]";
    private final String user = "postgres";
    private final String password = "Ea159357.";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void getPatients() {
        String SQL = "SELECT * FROM patients";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("name") + "\t"
                        + rs.getString("surname"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        PostgreSQLJDBCExample example = new PostgreSQLJDBCExample();
        example.getPatients();
    }
}

