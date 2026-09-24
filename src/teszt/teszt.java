package teszt;

import app.Pakli;
import app.Program;
import app.Lap;
public class teszt {

  static Pakli pakli = new Pakli();
  static Program p = new Program();
    
    public static void main(String[] args) {
        
        tesztNincsNull();
        tesztNincsDupla();

        tesztEgyEsHaromKozott();
        tesztTombHossza();
    }

    private static void tesztNincsNull() {
        for(int i = 0; i < pakli.getLapok().length;i++){
            assert pakli.getLapok()[i] != null : "A pakliban NULL található!";
            }
        System.out.println("ok");
    }

    private static void tesztNincsDupla() {
        Lap[] tesztTomb = new Lap[21];
        for (int i = 0; i < pakli.getLapok().length; i++) {
            for (int j = 0; j < tesztTomb.length; j++) {
                assert pakli.getLapok()[i] != tesztTomb[j] : "Duplikált elem";
            }
            tesztTomb[i] = pakli.getLapok()[i];
        }
        System.out.println("ok");
    }
    
  private static void tesztTombHossza() {
        int vartHossz = 21;
        int tombHossz = pakli.getLapok().length;
        assert vartHossz == tombHossz : "Nem 21";
        System.out.println("ok");
    }

    private static void tesztEgyEsHaromKozott() {
        int min = 1;
        int max = 3;
        int oszlop = p.melyik();
        assert min <=  oszlop : "nope";
        assert max >=  oszlop : "nope";
        System.out.println("oki");
       
    }

}//class
