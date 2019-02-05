package com.zhenya250398.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.apache.commons.lang3.RandomUtils.nextDouble;
import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    public static final int LIMIT = 5;

    private static Stream<Arguments> numGen() {
        return Stream.generate(() -> Arguments.of(nextDouble(),nextDouble())).limit(LIMIT);
    }

    private static double operation(double num1,String op,double num2){
        if("+".equals(op)){
            return num1+num2;
        } else if("-".equals(op)){
            return num1-num2;
        } else if("*".equals(op)){
            return num1*num2;
        } else if("/".equals(op)){
            return num1/num2;
        } else return  0;
    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcOne(double num1,double num2){
        Assertions.assertEquals( operation(num1,"+",num2) , Calc.opManager(num1,"+", num2));
    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcTwo(double num1,double num2){
        Assertions.assertEquals( operation(num1,"-",num2) , Calc.opManager(num1,"-", num2));
    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcThree(double num1,double num2){
        Assertions.assertEquals( operation(num1,"*",num2) , Calc.opManager(num1,"*", num2));
    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcFour(double num1,double num2){
        Assertions.assertEquals( operation(num1,"/",num2) , Calc.opManager(num1,"/", num2));
    }
}