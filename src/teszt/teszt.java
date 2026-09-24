package teszt;

import app.Pakli;
import app.Program;

public class teszt {

    
    
    
    
    
    
    static Pakli pakli = new Pakli();
    static Program p = new Program();
    
    public static void main(String[] args) {

        
        
        
        
        
        
        
        tesztEgyEsHaromKozott();
        tesztTombHossza();
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
