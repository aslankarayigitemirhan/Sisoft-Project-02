package hospitalsystemproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class GeneralClass {

    HospitalSystemProject[] hastaneler = new HospitalSystemProject[3];
    int size = 0;
    public GeneralClass() {
    }

    HospitalSystemProject hastaneOlusturVeEkle(String username, String password) {
        return this.hastaneler[size++] = new HospitalSystemProject(username,password);
    }
    
}
