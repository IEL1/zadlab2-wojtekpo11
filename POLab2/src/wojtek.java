/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Wojciech
 */
public class wojtek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, x;
        float suma = 0;
        float iloczyn = 0;
        float średnia = 0;
        float min = 0;
        float max = 0;
        System.out.println("Program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy.");

        float tab[] = new float[10];
        for (i = 0; i < tab.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPodaj liczbe " + i);
            tab[i] = scanner.nextFloat();
        }

        System.out.println("\nWybierz co chcesz zrobic: \n"
                + "1.Oblicz sumę elementów tablicy,\n"
                + "2.Oblicz iloczyn elementów tablicy,\n"
                + "3.Wartość średnią,\n"
                + "4.Wyznacz wartość minimalną,\n"
                + "5.Wyznacz wartość maksymalną.\n");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        switch (x) {
            case 1:
                for (i = 0; i < tab.length; i++) {
                    suma += tab[i];
                }
                System.out.println("\nSuma podanych liczb wynosi \n" + suma);
                break;
            case 2:
                for (i = 0; i < tab.length; i++) {
                    iloczyn = tab[0] * tab[1] * tab[2] * tab[3] * tab[4] * tab[5] * tab[6] * tab[7] * tab[8] * tab[9];
                }
                System.out.println("Iloczyn elementow wynosi: \n" + iloczyn);
                break;
            case 3:
                for (i = 0; i < tab.length; i++) {
                    średnia += tab[i] / 10;
                }
                System.out.println("Srednia elementow wynosi: \n" + średnia);
                break;
            case 4:
                min = tab[0];
                for (i = 1; i < tab.length; i++) {
                    if (tab[i] < min) {
                        min = tab[i];
                    }
                }
                System.out.println("Wartosc minimalna wynosi: \n" + min);
                break;
            case 5:
                max = tab[0];
                for (i = 1; i < tab.length; i++) {
                    if (tab[i] > max) {
                        max = tab[i];
                    }
                }
                System.out.println("Wartosc maksymalna wynosi: \n" + max);
                break;
            default:
                System.out.println("Zły wybór\n");
                break;

        }

    }
}
