package app;

public class Pakli {

    private Lap[] lapok = new Lap[21];

    public Pakli() {
        feltolt();
    }

    public void feltolt() {
        String[] szinek = {"P","T","Z","M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        
        int i = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                Lap lap = new Lap(szin,ertek);
                    if(i<21){
                            lapok[i]=lap;
                            i++;
                        }
                    }
                }
            
    }

    public Lap[] getLapok() {
        Lap[] ujLapok = lapok;
        return ujLapok;
    }
    
    
    
    
    
    
}
