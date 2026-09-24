package app;

public class Pakli {

    private Lap[] lapok = new Lap[21];

    public Pakli() {
        feltolt();
    }

    public void feltolt() {
        String[] szin = {"P","T","Z","M"};
        String[] ertek = {"Ász","Kir","Fel","X","IX","VIII"};
            for (int i = 0; i < 21;) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 6; k++) {
                        if(i<20){
                            
                            lapok[i]=new Lap(szin[j],ertek[k]);
                            i++;
                        }
                    }
                }
            }
    }
    
    
}
