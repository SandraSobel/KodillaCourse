package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFile() {
        //given
        FileReader fileReader = new FileReader();
        //when and then
        assertDoesNotThrow(()->fileReader.readFile("names.txt"));
    }
    @Test
    void whenFileDoesntExistReadFileShouldThrowException(){
        //given
        FileReader fileReader = new FileReader();
        String fileName="nie-ma-takiego-pliku.txt";
        //when and then
        assertThrows(FileReaderException.class,()-> fileReader.readFile(fileName));
    }
    @Test
    void testReadFileWithName(){
        //given
        FileReader fileReader = new FileReader();
        //when and then
        assertAll(
                ()->assertThrows(FileReaderException.class,()->fileReader.readFile("nie-ma-takiego-pliku.txt")),
                ()->assertThrows(FileReaderException.class,()->fileReader.readFile(null)),
                ()->assertDoesNotThrow(()->fileReader.readFile("names.txt"))
        );
    }



}
