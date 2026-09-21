package org.example;

public class Crecimiento {

    static int contar(int n){
        int comparaciones = 0;
        for( int i =0 ; i < n -1 ; i++){
            for (int j = 0 ; j < n -1 ; j++){
                comparaciones++;
            }
        }
        return comparaciones;
    }


    public static void main(String[] args){

        System.out.println( contar(5)) ;
    }
}