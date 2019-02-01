import java.util.Scanner;

public class Main {

    public static void main(){
        System.out.println("Введите число 1");
        double num1=getNum();
        System.out.println("Введите число 2");
        double num2 =getNum();
        System.out.println("Введите операцию");
        char op=getOp();
        double res=0;
        switch(op){
            case '+':
                Sum sum= new Sum();
                res=sum.sum(num1,num2);
            case '-':
                Sub sub= new Sub();
                res=sub.sub(num1,num2);
            case '*':
                Mul mul= new Mul();
                res=mul.mul(num1,num2);
            case '/':
                Dev dev= new Dev();
                res=dev.dev(num1,num2);
                default: System.out.println("ytn");
        }
        System.out.println(res);
    }

    public  static double getNum(){
        double num;
        Scanner in = new Scanner(System.in);
        num = in.nextDouble();
        return num;
    }

    public  static  char getOp(){
        char op;
        Scanner in = new Scanner(System.in);
        op=in.next().charAt(0);
        return  op;
    }

}

