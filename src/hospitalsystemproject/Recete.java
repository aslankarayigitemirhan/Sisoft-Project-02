package hospitalsystemproject;

import java.util.ArrayList;
import java.util.List;

public class Recete {

    private final long receteNo;
    private Hasta hasta;
    private List<String> ilaclar = new ArrayList<>();
    private int sizeIlac = 0;

    public Recete(List<String> ilaclar, Hasta hasta) {
        this.receteNo = (long) Math.random();
        this.hasta = hasta;
        this.ilaclar = ilaclar;
    }

    public long getReceteNo() {
        return receteNo;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public List<String> getIlaclar() {
        return ilaclar;
    }

    public void addIlac(String ilac) {
        this.ilaclar.add(ilac);
    }

}
