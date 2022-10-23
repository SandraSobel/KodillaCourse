package com.kodilla.rps;

import java.util.Random;

public class RpsComputerMove {
    int computerInt;
    Random generator = new Random();
    String computerMove;

    public String computerMove() {
        computerInt = generator.nextInt(3)+1;

        if (computerInt == 1) {
            computerMove = "1";}
        else if (computerInt == 2){
            computerMove = "2";}
        else if (computerInt == 3){
            computerMove = "3";}
        System.out.println("Ruch komputera: " + computerMove);
        return computerMove;

    }
}

