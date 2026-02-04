import java.util.Scanner;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class Calc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Calculator c=new Calculator();
        System.out.print("enter 2 nos: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("sum of 2 nos: "+c.add(x,y));
        System.out.print("enter 3 nos: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("sum of 3 nos: "+c.add(a,b,d));
        System.out.print("enter 2 decimal nos: ");
        double p=sc.nextDouble();
        double q=sc.nextDouble();
        System.out.println("sum of decimals: "+c.add(p,q));
    }
}

