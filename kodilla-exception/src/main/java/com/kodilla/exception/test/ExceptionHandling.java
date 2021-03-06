package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyWillThrowException(1, 2);
        } catch (Exception e) {
            System.out.println("Exception: wrong numbers");

        } finally {
            System.out.println("Finally");
        }
    }
}
