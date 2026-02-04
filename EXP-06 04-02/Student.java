import java.util.Scanner;

class Students{
    void displayResult(int marks){
        System.out.println("your result depends on your course");
    }
}

class UGStudent extends Students{
    void displayResult(int marks){
        if(marks>=75)
            System.out.println("ug grade: a");
        else
            System.out.println("ug grade: b");
    }
}

class PGStudent extends Students{
    void displayResult(int marks){
        if(marks>=80)
            System.out.println("pg grade: a");
        else
            System.out.println("pg grade: b");
    }
}

public class Student{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter ug marks: ");
        int ugMarks=sc.nextInt();
        UGStudent u=new UGStudent();
        System.out.println("ug student result:");
        u.displayResult(ugMarks);

        System.out.print("enter pg marks: ");
        int pgMarks=sc.nextInt();
        PGStudent p=new PGStudent();
        System.out.println("pg student result:");
        p.displayResult(pgMarks);
    }
}
