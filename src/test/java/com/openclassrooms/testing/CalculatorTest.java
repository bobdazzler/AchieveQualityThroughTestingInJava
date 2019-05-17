package com.openclassrooms.testing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void add_shouldReturnTheSum_ofTwoNumbers() {
        // arrange
        Integer expected = 3; // 1+2
        Calculator calculator = new Calculator();

        // act
        Integer result = calculator.add(1, 2);

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void multiply_shouldReturnTheProduct_ofTwoNumbers() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        Integer product = calculator.multiply(2, 3);

        // assert that product is equal to 6
        Integer expected = 6;
        assertThat(product, is( equalTo(expected))); // 2x3
    }

}
