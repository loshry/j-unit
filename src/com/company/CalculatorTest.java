package com.company;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    // will run before EVERY test
    @BeforeEach
    void setUp() {
        // make a fresh instance of the class
        // Arrange
        calculator = new Calculator();
    }




    // here
    @Test
    @DisplayName("Two plus five equals seven")
    void add_ValidInput_CorrectAnswer() {
        //Act
        int result = calculator.add(2, 5);
        //Assert
        assertEquals(result, 7);
    }

    @Test
    @DisplayName("Eight minus three equals five")

    void minus_ValidInput_CorrectAnswer(){
        int result = calculator.subtract(8, 3);
        assertEquals(result, 5);
    }

    @Test
    @DisplayName("Ten times four equals forty")

    void multiply_ValidInput_CorrectAnswer(){
        int result = calculator.multiply(10, 4);
        assertEquals(result, 40);
    }

    @Test
    @DisplayName("Two hundred divided by twenty-five equals eight")

    void divide_ValidInput_CorrectAnswer(){
        int result = calculator.divide(200, 25);
        assertEquals(result, 8);
    }

//
//    void add1() {
//    }
}