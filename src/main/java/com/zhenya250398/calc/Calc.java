package com.zhenya250398.calc;

public  class Calc{

    private final MathOperation sum;
    private final MathOperation sub;
    private final MathOperation mul;
    private final MathOperation div;

    public Calc(MathOperation sum, MathOperation sub, MathOperation mul, MathOperation div) {
        this.sum = sum;
        this.sub = sub;
        this.mul = mul;
        this.div = div;
    }


    public double calculation(double num1, String op, double num2){
        double res=0;
        if ("+".equals(op)) {
            res = sum.perform(num1, num2);
        } else if ("-".equals(op)) {
            res = sub.perform(num1, num2);
        } else if ("*".equals(op)) {
            res = mul.perform(num1, num2);
        } else if ("/".equals(op)) {
            res = div.perform(num1, num2);
        }
        return res;
    }
}
