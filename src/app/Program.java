package app;

public class Program {
static Pakli pakli = new Pakli();
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            kirak();
        }

    }

    private static void kirak() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + ". \t");
        }
        System.out.println();
        for (int i = 1; i < pakli.getLapok().length; i++) {
            System.out.print(pakli.getLapok()[i] + "\t");
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }

}

/*
    public static void main(String[] args) {

        FeltoltT();
        for (int i = 0; i < 3; i++) {
            Kirak(); //1 darab tömb
            int oszlop = Melyik(); //input - Scanner
            Kever(oszlop); //középre
        }
        EzVolt(); //11.elem, azaz a középső lap

        //pakli tömb kiírása
    }//main
 */
