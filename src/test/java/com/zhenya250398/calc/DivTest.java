package com.zhenya250398.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.apache.commons.lang3.RandomUtils.nextDouble;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivTest {
    public static final int LIMIT = 10;

    private static Stream<Arguments> numGen() {
        return Stream.generate(() -> Arguments.of(nextDouble(), nextDouble())).limit(LIMIT);
    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testDivOne(double num1, double num2) {
        Assertions.assertEquals(num1 / num2, new Div().perform(num1, num2));
    }

    @Test
    public void testZero() throws ArithmeticException {
        assertThrows(ArithmeticException.class, () -> new Div().perform(1, 0));
    }
}