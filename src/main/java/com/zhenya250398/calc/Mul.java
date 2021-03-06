package com.zhenya250398.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mul implements MathOperation{

    private static final Logger logger = LoggerFactory.getLogger(Mul.class);

    @Override
    public double perform(double num1, double num2){
        logger.info("first number: {}, second number: {}", num1,num2);
        double res=num1*num2;
        logger.debug("result: {}",res);
        return  res;
    }
}
