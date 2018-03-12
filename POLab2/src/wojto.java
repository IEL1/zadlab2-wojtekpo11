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
public class wojto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;

        System.out.println("Program, który w nieskończoność pyta użytkownika o liczby całkowite.\n" + "Jeżeli poda mniejsza od zera wychodzi z programu.\n");

        for (;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPodaj liczbe całkowitą: ");
            i = scanner.nextInt();
            if (i < 0) {
                System.out.println("Podałeś liczbę mniejszą od zera!\n");
                break;
            }
        }

    }

}
