import java.util.Scanner;
class Account{
    String holder;
    double balance;
}
class Savings extends Account{
    void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Savings account holder name: ");
        holder=sc.nextLine();
        System.out.print("Enter Savings balance: ");
        balance=sc.nextDouble();
    }
    void display(){
        System.out.println("--- Savings Account ---");
        System.out.println("Account Holder: "+holder);
        System.out.println("Balance: "+balance);
    }
}
class Current extends Account{
    void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Current account holder name: ");
        holder=sc.nextLine();
        System.out.print("Enter Current balance: ");
        balance=sc.nextDouble();
    }
    void display(){
        System.out.println("--- Current Account ---");
        System.out.println("Account Holder: "+holder);
        System.out.println("Balance: "+balance);
    }
}
public class Bank{
    public static void main(String[] args){
        Savings s=new Savings();
        s.getInput();
        s.display();
        Current c=new Current();
        c.getInput();
        c.display();
    }
}
