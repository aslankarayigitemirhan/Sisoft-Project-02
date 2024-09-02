package hospitalsystemproject;

import java.util.ArrayList;
import java.util.List;

public class Hasta extends Person {
    List<Randevu> randevularim = new ArrayList<>();
    List<Recete> receteleri = new ArrayList<>();
    public Hasta(String name, String surname, String tc) {
        this.name = name;
        this.surname = surname;
        this.tc = tc;
    }
    
    void getInfo(){
        System.out.println(this.name + " " +this.surname);
    }
}
