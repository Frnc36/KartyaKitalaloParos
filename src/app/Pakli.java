package app;

public class Pakli {

    private Lap[] lapok = new Lap[22];

    public Pakli() {
        feltolt();
    }

    public void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int i = 1;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                Lap lap = new Lap(szin, ertek);
                if (i < 22) {
                    lapok[i] = lap;
                    i++;
                }

            }
        }

    }

    public Lap[] getLapok() {
        Lap[] ujLapok = lapok;
        return ujLapok;
    }

    public void kever(int oszlop) {
        Lap[] regiLapok = lapok.clone();
        switch (oszlop) {
            case 1:
                for (int i = 1; i < 8; i++) {
                    lapok[i] = regiLapok[20 - (i - 1) * 3];
                    lapok[i + 7] = regiLapok[19 - (i - 1) * 3];
                    lapok[i + 14] = regiLapok[21 - (i - 1) * 3];

                }
                break;
            case 2:
                for (int i = 1; i < 8; i++) {
                    lapok[i] = regiLapok[19 - (i - 1) * 3];
                    lapok[i + 7] = regiLapok[20 - (i - 1) * 3];
                    lapok[i + 14] = regiLapok[21 - (i - 1) * 3];

                }
                break;
            default:
                for (int i = 1; i < 8; i++) {
                    lapok[i] = regiLapok[19 - (i - 1) * 3];
                    lapok[i + 7] = regiLapok[21 - (i - 1) * 3];
                    lapok[i + 14] = regiLapok[20 - (i - 1) * 3];

                }
                break;
        }
    }

    public Lap ezVolt() {
        return lapok[11];
    }

}
