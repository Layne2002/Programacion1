package chuletario;

import java.util.Random;

public class Aleatorio {
    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(141) + 10;  // Genera un número aleatorio entre 10 y 150
    }
}

