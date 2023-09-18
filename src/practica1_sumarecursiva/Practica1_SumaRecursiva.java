package practica1_sumarecursiva;

import java.util.Scanner;

public class Practica1_SumaRecursiva {

    public static void main(String[] args) {
        Scanner en=new Scanner(System.in);
        int limI, limS, resultado;
        
        System.out.println("Ingresa el límite inferior");
        limI = en.nextInt();
        System.out.println("Ingresa el límite superior");
        limS = en.nextInt();
        resultado = sumatoria(limI, limS);
        System.out.println("El resultado de la sumatoria con límite: " + limI + " - " + limS + " es: " + resultado);
        
    }
    
    private static int sumatoria(int limI, int limS){
        if(limI>limS){
            return 0;
        }
        else{
            return (int)(Math.pow(limI,2)) + sumatoria(limI + 1, limS);
        }
    }
    
}
