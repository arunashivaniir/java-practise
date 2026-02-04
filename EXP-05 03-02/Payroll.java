import java.util.Scanner;
abstract class Employee{
    abstract double calculateSalary();
}
class RegularEmployee extends Employee{
    double basic;
    double calculateSalary(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basic=sc.nextDouble();
        return basic+basic*0.2;
    }
}
class ContractEmployee extends Employee{
    double payPerDay;
    int days;
    double calculateSalary(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter pay per day: ");
        payPerDay=sc.nextDouble();
        System.out.print("Enter days worked: ");
        days=sc.nextInt();
        return payPerDay*days;
    }
}
public class Payroll{
    public static void main(String[] args){
        RegularEmployee r=new RegularEmployee();
        System.out.println("Regular Salary: "+r.calculateSalary());
        ContractEmployee c=new ContractEmployee();
        System.out.println("Contract Salary: "+c.calculateSalary());
    }
}
