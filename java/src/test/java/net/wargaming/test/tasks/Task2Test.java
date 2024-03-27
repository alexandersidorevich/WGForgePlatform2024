package net.wargaming.test.tasks;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2Test {

    public static final BigInteger FIBONACCI_1000_ELEMENT = new BigInteger("43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875");

    @Test
    void testFirstTenFibonacciNumbers() {
        var iterator = Task2.finobacciIterator();
        BigInteger[] expected = {
                BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.valueOf(2),
                BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(8),
                BigInteger.valueOf(13), BigInteger.valueOf(21), BigInteger.valueOf(34)
        };

        for (BigInteger expectedValue : expected) {
            BigInteger actual = iterator.next();
            assertEquals(expectedValue, actual, format("Expected value is %s, but found %s", expectedValue, actual));
        }
    }

    @Test
    void test1000Element() {
        var iterator = Task2.finobacciIterator();
        for (int i = 0; i <= 1000; i++) {
            assertTrue(iterator.hasNext());
            BigInteger actual = iterator.next();
            if (i == 1000) {
                assertEquals(FIBONACCI_1000_ELEMENT, actual, format("Expected value is %s, but found %s", FIBONACCI_1000_ELEMENT, actual));
            }
        }
    }
}