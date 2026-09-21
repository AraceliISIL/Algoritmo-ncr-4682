package org.example;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args){
        int[] vector = {5,3,8,4,2};
        int comparaciones = 0;

        for (int i = 0; i <vector.length - 1; i++){
            for(int j = 0 ; j < vector.length-1; j++){
                comparaciones++;
                if(vector[j] > vector[j+1]){
                    int temp = vector[j];
                    vector[j]= vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
            System.out.println("pasada " +  (i + 1 ) + " : " + Arrays.toString(vector));
        }
        System.out.println("final: " +  Arrays.toString(vector));
        System.out.println("compraciones : " +  comparaciones);

    }
    }