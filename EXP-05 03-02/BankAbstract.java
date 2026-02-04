import java.util.Scanner;
abstract class BankAccount{
    double balance;
    abstract double calculateInterest();
}
class SavingsAccount extends BankAccount{
    double calculateInterest(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Savings balance: ");
        balance=sc.nextDouble();
        return balance*0.05;
    }
}
class CurrentAccount extends BankAccount{
    double calculateInterest(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Current balance: ");
        balance=sc.nextDouble();
        return balance*0.02;
    }
}
public class BankAbstract{
    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount();
        System.out.println("Savings Interest: "+s.calculateInterest());

        CurrentAccount c=new CurrentAccount();
        System.out.println("Current Interest: "+c.calculateInterest());
    }
}
