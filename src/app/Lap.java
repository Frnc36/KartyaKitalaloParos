package app;

public class Lap {

    private String szin;
    private String ertek;

    public Lap(String szin, String ertek) {
        this.szin = szin;
        this.ertek = ertek;
    }

    public String getSzin() {
        return szin;
    }

    public String getErtek() {
        return ertek;
    }

    public String megjelenit() {
        return szin + "_" + ertek;
    }

}//class
