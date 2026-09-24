package app;

public class Pakli {

    private Lap[] lapok = new Lap[21];

    public Pakli() {
        feltolt();
    }

    public void feltolt() {
            for (int i = 0; i < 21;) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 6; k++) {
                        if(i<21){
                            i++;
                            lapok[i]=Lap(j,k);
                        }
                    }
                }
            }
    }
    
    
}
