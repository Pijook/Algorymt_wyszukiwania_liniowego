package com.company;

import java.util.Scanner;

public class Main {

    //Jakub Bielecki 4E nr 2

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj lancuch: ");
        String lancuch = scanner.nextLine();
        System.out.print("Podaj wzorzec: ");
        String wzorzec = scanner.nextLine();


        if(lancuch.length() < wzorzec.length()){
            System.out.println("Nie znaleziono wzorca");
            return;
        }

        for(int k = 0; k < lancuch.length(); k++){
            int i = 0;

            if(lancuch.charAt(k) == wzorzec.charAt(i)){
                int z = k;
                for(; i < wzorzec.length(); i++){
                    if(lancuch.charAt(z) == wzorzec.charAt(i)){
                        z++;
                    }
                    else{
                        break;
                    }
                }

                if(i == wzorzec.length()){
                    System.out.print("Znaleziono wzorzec na indeksie numer: " + k);
                    return;
                }
            }

        }


        System.out.print("Nie znaleziono wzorca");
    }
}
