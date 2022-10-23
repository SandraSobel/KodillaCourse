package com.kodilla.rps;

import java.util.Scanner;

public class RpsEndCurrentGame {


    Scanner scan = new Scanner(System.in);
    String personPlay;


    public void endCurrentGame(){
       System.out.println("Czy napewno chcesz calkowicie zakonczyc gre?\n" +
                    "Odpowiedz tak aby potwierdzic lub nie aby anulowac");
       personPlay = scan.next();

       if (personPlay.equals("tak")) {
           }
    }
}
