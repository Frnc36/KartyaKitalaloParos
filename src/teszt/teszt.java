package teszt;

import app.Pakli;
import app.Program;
import app.Lap;

public class teszt {

    static Pakli pakli = new Pakli();
    static Program p = new Program();

    public static void main(String[] args) {

        String[] tesztTomb = {"P_Ász", "P_Kir", "P_Fel", "P_X", "P_IX", "P_VIII", "T_Ász", "T_Kir", "T_Fel", "T_X", "T_IX", "T_VIII", "Z_Ász", "Z_Kir", "Z_Fel", "Z_X", "Z_IX", "Z_VIII", "M_Ász", "M_Kir", "M_Fel"};
        //Bea
        tesztNincsNull();
        tesztNincsDupla();
        tesztPaklibanNincsNullKeveresUtan();
        tesztPaklibanNincsDuplikatumKEveresUtan();

        //Feri
        tesztTombHossza();
        tesztPakliMereteNemValtozikKeveresUtan();
        tesztEgyEsHaromKozott();
        tesztMindenLapVanAPakliban(tesztTomb);
    }

    private static void tesztNincsNull() {
        for (int i = 1; i < pakli.getLapok().length; i++) {
            assert pakli.getLapok()[i] != null : "A pakliban NULL található!";
        }
        System.out.println("Ok");
    }

    private static void tesztNincsDupla() {
        Lap[] tesztTomb = new Lap[22];
        for (int i = 1; i < pakli.getLapok().length; i++) {
            for (int j = 0; j < tesztTomb.length; j++) {
                assert pakli.getLapok()[i] != tesztTomb[j] : "Duplikált elem";
            }
            tesztTomb[i] = pakli.getLapok()[i];
        }
        System.out.println("Ok");
    }

    private static void tesztTombHossza() {
        int vartHossz = 22;
        int tombHossz = pakli.getLapok().length;
        assert vartHossz == tombHossz : "Nem 21 a tömb hossza.";
        System.out.println("Ok");
    }

    private static void tesztEgyEsHaromKozott() {
        int min = 1;
        int max = 3;
        int oszlop = p.melyik();
        assert min <= oszlop : "Kissebb mint a minimum érték!";
        assert max >= oszlop : "Nagyobb mint a maximum érték!";
        System.out.println("Ok");

    }

    private static void tesztMindenLapVanAPakliban(String[] tomb) {
        pakli.feltolt();
        for (int i = 1; i < pakli.getLapok().length; i++) {
            assert tomb[i - 1].equals(pakli.getLapok()[i].megjelenit()) : "Nem szerepel!";
            //System.out.println(pakli.getLapok()[i].megjelenit());
        }
        System.out.println("Ok");
    }

    private static void tesztPaklibanNincsNullKeveresUtan() {
        pakli.kever(2);
        tesztNincsNull();
    }

    private static void tesztPakliMereteNemValtozikKeveresUtan() {
        pakli.kever(3);
        tesztTombHossza();
    }

    private static void tesztPaklibanNincsDuplikatumKEveresUtan() {
        pakli.kever(1);
        tesztNincsDupla();
    }

}//class
