package org.example;

public class OrdenesCrecientes {


    //Orden constante - o(1)
    static int constante(int n){
        return 2;
    }

    //orden logaritmico - o log (n)
    static int logaritmo(int n){
        int c= 0;
        while( n > 1){
            n/=2;
            c++;
        }
        return c;
    }

    //orden lineal - o (n)
    static int lineal(int n){
        int c = 0;
        for(int i = 0; i <n ; i++){
            c++;
        }
        return c;
    }

    //orden cuadrtico
}