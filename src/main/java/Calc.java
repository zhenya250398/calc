public  class Calc{
    public  static double opManager(double num1,String op,double num2){

        double res=0;
        if ("+".equals(op)) {
            Sum sum = new Sum();
            res = sum.sum(num1, num2);
        } else if ("-".equals(op)) {
            Sub sub = new Sub();
            res = sub.sub(num1, num2);
        } else if ("*".equals(op)) {
            Mul mul = new Mul();
            res = mul.mul(num1, num2);
        } else if ("/".equals(op)) {
            Div div = new Div();
            res = div.div(num1, num2);
        }
        System.out.println("ytn");
        return res;
    }
}
