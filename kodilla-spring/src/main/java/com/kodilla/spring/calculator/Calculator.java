package com.kodilla.spring.calculator;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Calculator {
    Display display;

    //wstrzykiwanie aby powiazac display i calculator
    public void add(double a, double b){
        double val = a+b;
        display.displayValue(val);
    }
    public void  sub(double a, double b){
        double val = a-b;
        display.displayValue(val);
    }
    public void  mul(double a, double b){
        double val = a*b;
        display.displayValue(val);
    }
    public void div(double a, double b){
        double val = a/b;
        display.displayValue(val);
    }
}
