package com.devcalc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testAdd() { assertEquals(15, service.add(10, 5)); }

    @Test
    void testSubtract() { assertEquals(5, service.subtract(10, 5)); }

    @Test
    void testMultiply() { assertEquals(50, service.multiply(10, 5)); }

    @Test
    void testDivide() { assertEquals(2, service.divide(10, 5)); }
}
