package ulohy.zamestnanci.model;

public class Zamestnanec {
    String meno;
    String priezvisko;
    char pohlavie;
    int roknarodenia;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public char getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(char pohlavie) {
        this.pohlavie = pohlavie;
    }

    public int getRoknarodenia() {
        return roknarodenia;
    }

    public void setRoknarodenia(int roknarodenia) {
        this.roknarodenia = roknarodenia;
    }

    //konstruktor
    public Zamestnanec(String meno, String priezvisko, char pohlavie, int roknarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.roknarodenia = roknarodenia;
    }

    //prazdny konstruktor
    public Zamestnanec() {
    }

    public Zamestnanec(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    //TODO upraviť to String, aby vypisoval pod seba
    @Override
    public String toString() {

        return "Zamestnanec : " +
                "\n meno            :" + meno +
                "\n priezvisko      :" + priezvisko +
                "\n pohlavie        :" +pohlavie +
                 "\n rok narodenia   :" + roknarodenia;
    }
}
