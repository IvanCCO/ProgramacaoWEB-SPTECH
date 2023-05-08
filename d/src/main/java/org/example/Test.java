package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            Stack<Integer> pilhaCriada = new Stack<Integer>();
            Stack<Integer> pilhaDiscartada = new Stack<Integer>();

            boolean isPrimeiraVolta = true;

            while (true) {

                if(isPrimeiraVolta){
                for (int i = n; i >= 1; i--) {
                    pilhaCriada.push(i);
                }
                isPrimeiraVolta = false;
                }

                if(pilhaCriada.size() <= 1){
                    break;
                }

                pilhaDiscartada.push(pilhaCriada.peek());
                pilhaCriada.pop();

                Stack<Integer> x = new Stack<Integer>();


                if(pilhaCriada.size() > 1){
                    x.push(pilhaCriada.peek());
                }

                for(int i =0; i<pilhaCriada.size() - 1; i++){
                    x.push(pilhaCriada.elementAt(i));
                }

                pilhaCriada = x;
            }

            for(int i = 0; i<pilhaCriada.size(); i++){
                System.out.println(pilhaCriada.elementAt(i));
            }

        }
    }
}
