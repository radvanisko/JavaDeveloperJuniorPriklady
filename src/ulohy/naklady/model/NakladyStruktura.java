package ulohy.naklady.model;




import ulohy.bookcaseobjektovo.model.KnihaObject;
import ulohy.bookcaseobjektovo.model.ZoznamObjekt;

import java.util.ArrayList;
import java.util.Date;

public class NakladyStruktura {

    private String popisNakladu;
    private String kategoria;
    private double suma;

    @Override
    public String toString() {
        return "NakladyStruktura{" +
                "popisNakladu='" + popisNakladu + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", suma=" + suma +
                ", datumZadania=" + datumZadania +
                '}';
    }

    public String getPopisNakladu() {
        return popisNakladu;
    }

    public void setPopisNakladu(String popisNakladu) {
        this.popisNakladu = popisNakladu;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }


    private String datumZadania;

    public String getDatumZadania() {
        return datumZadania;
    }

    public void setDatumZadania(String datumZadania) {
        this.datumZadania = datumZadania;
    }

    public static ArrayList<NakladyStruktura> naplnTestovacimiUdajmi()

    {
        ArrayList<NakladyStruktura> zoznamLokalny = new ArrayList<>();

        NakladyStruktura nakladLokalny = new NakladyStruktura();

        nakladLokalny.setPopisNakladu("Hypoteka");
        nakladLokalny.setKategoria("byvanie");
        nakladLokalny.setSuma(500);

        zoznamLokalny.add(nakladLokalny);

        nakladLokalny = new NakladyStruktura();

        nakladLokalny.setPopisNakladu("Internet");
        nakladLokalny.setKategoria("byvanie");
        nakladLokalny.setSuma(50);

        zoznamLokalny.add(nakladLokalny);
        return zoznamLokalny;
    }




}
