package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Autowired
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        //when
        calculator.add(10,5);
        //then
        //do nothing
    }
    @Test
    public void testSub(){
        //given
        calculator.sub(10,5);

    }
    @Test
    public void testMul(){
        //given
        calculator.mul(10,5);

    }
    @Test
    public void testDiv(){
        //given
        calculator.div(10,5);

    }
}
