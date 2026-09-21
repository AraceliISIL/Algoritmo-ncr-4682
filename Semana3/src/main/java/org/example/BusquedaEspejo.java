package org.example;


public class BusquedaEspejo {
    static int buscar(int[] v,int objetivo){
        int c=0;
        for(int i=0;i<v.length;i++){
            c++;
            if(v[i]==objetivo){
                System.out.println("objetivo="+objetivo+" indice="+i+" comparaciones="+c);
                return i;
            }
        }
        System.out.println("objetivo="+objetivo+" indice=-1 comparaciones="+c); return -1;
    }
    public static void main(String[] args){
        int[] v={9,4,12,7,20,3};
        // TODO T01: llama a buscar para 9 y para 3.
        // Predice las comparaciones antes de ejecutar.
        //buscar 9 y 3
        buscar(v,9);
        buscar(v,3);
    }
}

