package net.wargaming.test.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @ParameterizedTest
    @CsvSource({"2,2,4", "3,2,9", "2,3,8", "3,3,27"})
    void testPowFunc(int base, int exponent, int expected) {
        var powFunc = Task3.powFunc(exponent);
        int result = powFunc.applyAsInt(base);
        assertEquals(expected, result, String.format("Expected result is %d, but found %s", expected, result));
    }

    @Test
    void testOverflow() {
        var powFunc = Task3.powFunc(2);
        assertThrows(ArithmeticException.class, () -> powFunc.applyAsInt(Integer.MAX_VALUE));
    }
}