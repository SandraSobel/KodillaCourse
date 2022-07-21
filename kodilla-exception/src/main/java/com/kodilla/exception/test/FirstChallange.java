package com.kodilla.exception.test;

public class FirstChallange {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a/b;

    }
    /** This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main (String [] args){
        FirstChallange firstChallange = new FirstChallange();
        try {
            double result = firstChallange.divide(3, 0);
            System.out.println(result);
        } catch(ArithmeticException ae){
            System.out.println("Nie dzieli sie przez zero");
        } finally {
            System.out.println("Zakonczono dzialanie");
        }

    }
}
