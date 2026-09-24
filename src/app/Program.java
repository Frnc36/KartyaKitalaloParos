package app;

import java.util.Scanner;

public class Program {

    static Scanner sc = new Scanner(System.in);
    static Pakli pakli = new Pakli();

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        System.out.println(pakli.ezVolt().megjelenit());

    }

    private static void kirak() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + ". \t");
        }
        System.out.println();
        for (int i = 0; i < pakli.getLapok().length; i++) {
            System.out.print(pakli.getLapok()[i].megjelenit() + "\t");
            if (i != 0 && i % 3 == 2) {
                System.out.println();
            }
        }
    }

    private static int melyik() {
        int oszlop;
        do {
            System.out.print("Melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
        } while (oszlop < 1 || oszlop > 3);
        return oszlop;
    }

}
