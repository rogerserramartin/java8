package com.rogerserra.functionalinterfaces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalInterfaceTest {

    private Mathematics underTest;

    @Test
    @DisplayName("Add values")
    void canAdd(){
        // GIVEN
        underTest = (x, y) -> x + y;
        double first = 40;
        double second = 590;
        // WHEN
        double result = underTest.operate(first, second);
        // THEN
        double expected = first + second;
        assertEquals(result, expected);

    }
    @Test
    @DisplayName("Add values but with reference method")
    void canAddButReferenceMethod(){
        // GIVEN
        underTest = Double::sum;
        double first = 40;
        double second = 590;
        // WHEN
        double result = underTest.operate(first, second);
        // THEN
        double expected = first + second;
        assertEquals(result, expected);

    }

    @Test
    @DisplayName("Subtract values")
    void canSubtract(){
        // GIVEN
        underTest = (x, y) -> x - y;
        double first = 40;
        double second = 590;
        // WHEN
        double result = underTest.operate(first, second);
        // THEN
        double expected = first - second;
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Multiply values")
    void canMultiply(){
        // GIVEN
        underTest = (x, y) -> x * y;
        double first = 40;
        double second = 590;
        // WHEN
        double result = underTest.operate(first, second);
        // THEN
        double expected = first * second;
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Divide values")
    void canDivide(){
        // GIVEN
        underTest = (x, y) -> x / y;
        double first = 40;
        double second = 590;
        // WHEN
        double result = underTest.operate(first, second);
        // THEN
        double expected = first / second;
        assertEquals(result, expected);
    }
}
