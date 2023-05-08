
package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static boolean isPalindromo(int[]vetor){

        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] != vetor[vetor.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromo(String palavra){

        char[]vetor = palavra.toCharArray();

        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] != vetor[vetor.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void convertDecimalToBinary(int decimal){


        Stack<Integer> pilha = new Stack<>();

        while(true){

            pilha.push(decimal%2);
            decimal /= 2;

            if(decimal == 1){
                pilha.push(1);
                break;
            }

        }

        for(int i = pilha.size()-1; i >=0; i--){
            System.out.println(pilha.elementAt(i));
        }
    }


    public static void exibirAoContrario(String nome){


        for(int i = nome.toCharArray().length-1; i>=0; i--){

            System.out.println(nome.charAt(i));

        }

    }








    public static void main(String[] args) {

        int[] vetor = {1,3,2,3,1};

//        System.out.println(isPalindromo(vetor));
//        convertDecimalToBinary(32);
//        exibirAoContrario("A pilha do gato");
        System.out.println(isPalindromo("natan"));




    }
}