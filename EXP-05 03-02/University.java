import java.util.Scanner;
abstract class Course{
    abstract void getDetails();
}
class OnlineCourse extends Course{
    void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter online course name: ");
        String name=sc.nextLine();
        System.out.println("Course Type: online");
        System.out.println("Course name: "+name);
    }
}
class OfflineCourse extends Course{
    void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter offline ourse name: ");
        String name=sc.nextLine();
        System.out.println("Course Type: offline");
        System.out.println("Course Name: "+name);
    }
}
class HybridCourse extends Course{
    void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hybrid course name: ");
        String name=sc.nextLine();
        System.out.println("Course Type: hybrid");
        System.out.println("Course Name: "+name);
    }
}
public class University{
    public static void main(String[] args){
        OnlineCourse o=new OnlineCourse();
        o.getDetails();
        OfflineCourse f=new OfflineCourse();
        f.getDetails();
        HybridCourse h=new HybridCourse();
        h.getDetails();
    }
}
