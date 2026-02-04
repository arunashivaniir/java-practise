import java.util.Scanner;

class Student{
    String name;
    int rollNo;

    void getDetails(String n,int r){
        name=n;
        rollNo=r;
    }

    void display(){
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }
}

public class Result extends Student{
    int m1,m2,m3;

    void getMarks(int a,int b,int c){
        m1=a;
        m2=b;
        m3=c;
    }

    void showResult(){
        int total=m1+m2+m3;
        System.out.println("Total Marks: "+total);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Result r=new Result();

        System.out.print("Enter student name: ");
        String name=sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll=sc.nextInt();

        System.out.print("Enter mark 1: ");
        int m1=sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2=sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3=sc.nextInt();

        r.getDetails(name,roll);
        r.getMarks(m1,m2,m3);

        r.display();
        r.showResult();
    }
}
