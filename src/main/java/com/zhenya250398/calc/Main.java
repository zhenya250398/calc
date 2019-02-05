package com.zhenya250398.calc;

public class Main {

    public static void main(String[] args){
        double num1= Double.valueOf(args[0]);
        double num2 =  Double.valueOf(args[2]);
        String op = args[1];
        Calc calc = new Calc(new Sum(),new Sub(),new Mul(),new Div());
        double res=calc.calculation(num1,op,num2);
        System.out.println(res);
    }


}

