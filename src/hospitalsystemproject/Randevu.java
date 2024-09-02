package hospitalsystemproject;

import java.time.LocalDateTime;
import java.util.List;

public class Randevu {

    private LocalDateTime tarihi;
    private boolean ihlal = false;
    private Hasta hasta;
    private Recete muayeneRecetesi;

    public Randevu(LocalDateTime tarihi, Hasta hasta) {
        this.hasta = hasta;
        this.hasta = hasta;
    }

    void ihlalEt() {
        this.ihlal = true;
    }

    void receteYaz(List<String> ilaclar) {
        this.muayeneRecetesi = new Recete(ilaclar, this.hasta);
    }

}
