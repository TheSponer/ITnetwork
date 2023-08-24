package SPNR;

public class Uzivatele {

    private final String jmeno;
    private final String prijmeni;
    private final String vek;
    private final String telefon;


    public Uzivatele(String jmeno, String prijmeni, String vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return this.jmeno;
    }
    public String getPrijmeni() {
        return this.prijmeni;
    }
    public String getVek() {return this.vek;}
    public String getTelefon() {
        return this.telefon;
    }

    @Override
    public String toString(){
        return this.jmeno + " " + prijmeni + " " + vek + " " + telefon + " ";
    }

}
