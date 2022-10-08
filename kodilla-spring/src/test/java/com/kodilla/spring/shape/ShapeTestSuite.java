package com.kodilla.spring.shape;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTestSuite {
    @Test
    void testCircleLoadedIntoContainer(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape =(Shape)context.getBean("circle");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("This is a circle",name);

    }
    @Test
    void testTriangleLoadedIntoContainer(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("triangle");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("This is a triangle",name);

    }
    @Test
    void testSquareLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("createSquare");
        //when
        String name = shape.getShapeName();
        //then
        assertEquals("This is a square", name);
    }
    @Test
    void testShapeLoaderIntoContainer(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape");
        //when
        String name = shape.getShapeName();
        //then
        System.out.println("Chosen shape says: "+ name);
    }
}
