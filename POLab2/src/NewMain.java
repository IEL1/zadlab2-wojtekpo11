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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, x;
        boolean y = false;

        System.out.println("Program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy.");
        int tab[] = new int[10];
        for (i = 0; i < tab.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPodaj liczbe " + i);
            tab[i] = scanner.nextInt();
        }

        System.out.println("Wybierz co chcesz zrobic:\n");
        System.out.println("1.Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n"
                + "2.Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n"
                + "3.Wyświetlanie elementów o nieparzystych indeksach.\n"
                + "4.Wyświetlanie elementów o parzystych indeksach.");

        do {
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            if (x == 1) {
                y = true;
                for (i = 0; i < 10; i++) {
                    System.out.println(tab[i] + " ");
                }
            } else if (x == 2) {
                y = true;
                for (i = 9; i >= 0; i--) {
                    System.out.println(tab[i] + " ");
                }
            } else if (x == 3) {
                y = true;
                for (i = 1; i < 10; i = i + 2) {
                    System.out.println(tab[i] + " ");
                }
            } else if (x == 4) {
                y = true;
                for (i = 0; i < 10; i = i + 2) {
                    System.out.println(tab[i] + " ");
                }
            } else {
                y = false;
            }
        } while (y != true);

        // TODO code application logic here
    }

}
