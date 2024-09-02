package hospitalsystemproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doktor extends Person {

    private List<Hasta> bakilanHastalar = new ArrayList<>();
    protected String bransi;

    public Doktor(String name, String surname, String tc, String bransi) {
        this.name = name;
        this.surname = surname;
        this.tc = tc;
        this.bransi = bransi;
    }

    void muayeneEt(Hasta hasta) {
        this.bakilanHastalar.add(hasta);
    }

    void muayeneEt(HospitalSystemProject hs) {
        Scanner scan = new Scanner(System.in);
        Hasta bakilan = hs.bekleyenHastalarIlgiliDoktor.get(this).remove(0);
        bakilan.randevularim.remove(0);
        this.bakilanHastalar.add(bakilan);
        System.out.println("Kac tane ilac yazacaksiniz:");
        int ilacSayisi = scan.nextInt();
        System.out.println("Yazmak istediginiz ilacı giriniz:)");
        List<String> ilaclar = new ArrayList<>();
        int iter = 0;
        while (iter < ilacSayisi) {
            ilaclar.add(scan.next());
            iter++;
        }
        Recete hastaRecetesi = new Recete(ilaclar, bakilan);
    }

}
