package com.kodilla.exception.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {
    @Test
    void secondChallengeTest() {
        //giben
        SecondChallenge secondChallenge = new SecondChallenge();
        //when and then
        assertAll(
                ()->assertThrows(Exception.class,()->secondChallenge.probablyWillThrowException(1,1.5)),
                ()->assertThrows(Exception.class,()->secondChallenge.probablyWillThrowException(2,1)),
                ()->assertDoesNotThrow(()->secondChallenge.probablyWillThrowException(1,2)),
                ()->assertDoesNotThrow(()->secondChallenge.probablyWillThrowException(1,1.51))
        );
    }
}
