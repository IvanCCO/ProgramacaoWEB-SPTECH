package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Quantidade de testes

        int teste = in.nextInt();

        for (int i=0; i<teste; i++){

            String a = in.next();
            String b = in.next();

            if(a.indexOf(b, a.length() - b.length()) >= 0){

                System.out.println("encaixa");

            }else{
                System.out.println("nao encaixa");
            }


        }

        }



    }