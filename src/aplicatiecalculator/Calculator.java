package aplicatiecalculator;

import java.util.Scanner;

public class Calculator {
    private int numar1;
    private int numar2;
    private char operation;

    private String display;

    Scanner cititor = new Scanner(System.in);
    Scanner cititor2 = new Scanner(System.in);

    public Calculator() {
    }

    public static int aduna(int numar1, int numar2) {
        return numar1 + numar2;
    }

    public static int scade(int numar1, int numar2) {
        return numar1 - numar2;
    }

    public static int inmulteste(int numar1, int numar2) {
        return numar1 * numar2;
    }

    public static double imparte(int numar1, int numar2) {
        if (numar2 == 0) {
            return 0;
        }
        return numar1 / numar2;
    }

    public void executaOperatie() {
        System.out.println("Introdu numarul 1: ");
        numar1 = cititor.nextInt();
        System.out.println("Introdu numarul 2: ");
        numar2 = cititor.nextInt();
        System.out.println("Alege o operatie (+,-, *,/)");
        operation = cititor2.next().charAt(0);
        switch (operation) {
            case '+':
                display = numar1 + " + " + numar2 + " = " + aduna(numar1, numar2);
                break;
            case '-':
                display = numar1 + " - " + numar2 + " = " + scade(numar1, numar2);
                break;
            case '*':
                display = numar1 + " * " + numar2 + " = " + inmulteste(numar1, numar2);
                break;
            case '/':
                display = numar1 + " / " + numar2 + " = " + imparte(numar1, numar2);
                break;
            default:
                System.out.println("operatie invalida");

        }

        System.out.println(display);

    }


}
