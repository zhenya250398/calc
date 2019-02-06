package com.zhenya250398.calc;

public class Div implements MathOperation{
    @Override
    public double perform(double num1, double num2){
        if(num2==0){
            throw new ArithmeticException ("zero division");
        }
        double res=num1/num2;
        return  res;
    }
}
