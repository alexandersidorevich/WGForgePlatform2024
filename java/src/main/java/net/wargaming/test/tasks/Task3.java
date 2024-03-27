package net.wargaming.test.tasks;

import java.util.function.IntUnaryOperator;

// Task #2
// ------------------------------------------------------------------------------------------------
// Write a function powFunc(x), which takes a number x as an argument and returns a function
// that raises its input to the power of n.
// Throws ArithmeticException if x to the n(th) power overflows in signed int arithmetic
public final class Task3 {

    /**
     * Returns a function that raises its input to the power of `n`.
     * <p>
     * The returned function takes an integer input and returns the result of raising that input to the power of `n`.
     *
     * @param n The exponent to which the input will be raised.
     * @return A function that raises its input to the power of `n`.
     * @throws ArithmeticException – if x to the n(th) power overflows in signed int arithmetic
     */
    public static IntUnaryOperator powFunc(Integer n) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}