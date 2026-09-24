package teszt;

import app.Lap;
import app.Pakli;

public class teszt {

    static Pakli pakli = new Pakli();
    
    public static void main(String[] args) {
        
        tesztNincsNull();
        tesztNincsDupla();
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
    
}
