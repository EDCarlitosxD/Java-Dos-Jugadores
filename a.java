package com.mycompany.adivinadooss;

import java.util.Scanner;
import java.util.Random;

public class a {

    public static void main(String args[]) {
        Random rndNumero = new Random();
        Scanner leer = new Scanner(System.in);

        int numero = rndNumero.nextInt(100) + 1;
        int x1 = 1;
        int x2 = 1;
        do {
            System.out.println("Dime un numero JUGADOR1 ");
            int numeroUsuario = leer.nextInt();
            if (numeroUsuario == numero) {
                System.out.println("Ganaste WOW JUGADOR 1 Con " + x1 + "INTENTOS");
                break;
            } else if (numeroUsuario > numero) {
                System.out.println("Huy estas lejos intentalo de nuevo JUGADOR 1");
            } else if (numeroUsuario < numero) {
                System.out.println("Huy estas cerca JUGADOR 1 ");
            }
            x1++;

            System.out.println("Dime un numero JUGADOR2 ");
            int numeroUsuario2 = leer.nextInt();
            if (numeroUsuario2 == numero) {
                System.out.println("Ganaste WOW JUGADOR 2 Con " + x2 + "INTENTOS");
                break;
            } else if (numeroUsuario2 > numero) {
                System.out.println("Huy estas lejos intentalo de nuevo JUGADOR 2 ");
            } else if (numeroUsuario2 < numero) {
                System.out.println("Huy estas cerca JUGADOR 2 ");
            }
            x2++;

        } while (x1 < 11 || x2 < 11);

        if (x1 == 11) {
            System.out.println("PERDISTES!!! JUGADOR 1");
        }
        if (x2 == 11) {
            System.out.println("PERDISTES!!! JUGADOR 2");
        }
    }
}
