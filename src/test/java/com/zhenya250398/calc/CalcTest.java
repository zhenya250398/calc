package com.zhenya250398.calc;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.stream.Stream;

import static org.apache.commons.lang3.RandomUtils.nextDouble;
import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.mockito.MockitoAnnotations.initMocks;
@TestInstance(PER_CLASS)
class CalcTest {
    public static final int LIMIT = 5;

    private Calc calc;
    @Mock
    private MathOperation sum;
    @Mock
    private MathOperation sub;
    @Mock
    private MathOperation mul;
    @Mock
    private MathOperation div;
    @BeforeAll
    public void before(){
        initMocks(this);
        this.calc=new Calc(sum,sub,mul,div);
    }


    private static Stream<Arguments> numGen() {
        return Stream.generate(() -> Arguments.of(nextDouble(),nextDouble())).limit(LIMIT);
    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcSum(double num1,double num2){
       calc.calculation(num1,"+",num2);
       Mockito.verify(sum).perform(num1,num2);
       Mockito.verifyZeroInteractions(sub,mul,div);
    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcSub(double num1,double num2){
        calc.calculation(num1,"-",num2);
        Mockito.verify(sub).perform(num1,num2);
        Mockito.verifyZeroInteractions(sum,mul,div);    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcMul(double num1,double num2){
        calc.calculation(num1,"*",num2);
        Mockito.verify(mul).perform(num1,num2);
        Mockito.verifyZeroInteractions(sub,sum,div);    }

    @ParameterizedTest
    @MethodSource("numGen")
    void testCalcDiv(double num1,double num2){
        calc.calculation(num1,"/",num2);
        Mockito.verify(div).perform(num1,num2);
        Mockito.verifyZeroInteractions(sub,mul,sum);    }
}