package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TareaVectores {

    public static void main(String[] args) {

        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        System.out.println("===== VECTOR DE INSCRITOS =====");

        System.out.println("Vector: " + Arrays.toString(inscritos));
        System.out.println("Tamaño: " + inscritos.length);

        // índices y valores
        for (int i = 0; i < inscritos.length; i++) {
            System.out.println("Indice: " + i + " -> " + inscritos[i]);
        }


        // mayor y menor
        int mayor = inscritos[0];
        int menor = inscritos[0];

        for (int i = 1; i < inscritos.length; i++) {

            if (inscritos[i] > mayor) {
                mayor = inscritos[i];
            }

            if (inscritos[i] < menor) {
                menor = inscritos[i];
            }
        }

        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);


        // insertar un nuevo valor
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nuevo valor: ");
        int nuevoValor = teclado.nextInt();

        System.out.print("Ingrese la posicion: ");
        int posicion = teclado.nextInt();

        if (posicion >= 0 && posicion <= inscritos.length) {

            int[] nuevoVector = new int[inscritos.length + 1];

            for (int i = 0; i < posicion; i++) {
                nuevoVector[i] = inscritos[i];
            }

            nuevoVector[posicion] = nuevoValor;

            for (int i = posicion; i < inscritos.length; i++) {
                nuevoVector[i + 1] = inscritos[i];
            }

            inscritos = nuevoVector;

            System.out.println("Después de insertar: "
                    + Arrays.toString(inscritos));

        } else {

            System.out.println("Posicion no valida");
        }


        // ordenamiento
        for (int i = 0; i < inscritos.length - 1; i++) {

            for (int j = 0; j < inscritos.length - 1 - i; j++) {

                if (inscritos[j] > inscritos[j + 1]) {

                    int temporal = inscritos[j];
                    inscritos[j] = inscritos[j + 1];
                    inscritos[j + 1] = temporal;
                }
            }
        }

        System.out.println("Vector ordenado: "
                + Arrays.toString(inscritos));
    }
}
