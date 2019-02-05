package com.zhenya250398.calc;

public class Sum implements MathOperation {
    @Override
    public double perform(double num1, double num2) {
        double res = num1 + num2;
        return res;
    }
}
