package org.example;

public class BusquedaCasos {

    static int buscar(int[] vector, int objetivo){


        int comparaciones =0;

        for( int i =0; i<vector.length; i++){
            comparaciones++;
            if(vector[i] == objetivo){
                System.out.println("obejetivo= " + objetivo + " se encuentra en el indice " + i + " se realizo " + comparaciones + " comparaciones");
                return i;
            }
        }
        System.out.println("obejetivo= " + objetivo + " se encuentra en el indice -1 se realizo " + comparaciones + " comparaciones");
        return -1;
    }

    public static void main(String[] args){
        int[] arreglo = {14,8,21,3,17};
        buscar(arreglo, 21);
        buscar(arreglo, 17);
        buscar(arreglo, 99);

    }
}
