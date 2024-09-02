package hospitalsystemproject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalSystemProject {

    private String username;
    private String password;

    public HospitalSystemProject(String userName, String password) {
        this.password = password;
        this.username = userName;
    }
    public Map<Doktor, List<Hasta>> bekleyenHastalarIlgiliDoktor = new HashMap<>();

    void hastaEkle(Doktor doc, Hasta h) {
        this.bekleyenHastalarIlgiliDoktor.get(doc).add(h);
    }

    void doktorEkle(Doktor doktor) {
        this.bekleyenHastalarIlgiliDoktor.put(doktor, new ArrayList<>());
    }

    String[][] bekleyenHastalarForThisDoctor(Doktor d) {
        int indexRow = 0;
        if(this.bekleyenHastalarIlgiliDoktor.get((Doktor)d).size() == 0){
            return null;
        }
        String[][] bilgiMatrix = new String[this.bekleyenHastalarIlgiliDoktor.get((Doktor)d).size()][3];
        for(Hasta h :this.bekleyenHastalarIlgiliDoktor.get((Doktor)d)){
            bilgiMatrix[indexRow][0] = h.name;
            bilgiMatrix[indexRow][1] = h.surname;
            bilgiMatrix[indexRow][2] = h.tc;
            indexRow++;
        }
         return bilgiMatrix;
    }

    boolean gercekHesap(String user, String password) {
        return this.username.equals(user) && this.password.equals(password);
    }

}
