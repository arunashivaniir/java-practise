import java.util.Scanner;
class Transport{
    protected String driverName;
    protected double distance;
    void displayDetails(){
        System.out.println("Driver Name: "+driverName);
        System.out.println("Distance: "+distance+" km");
    }
    double calculateFare(){
        return 0;
    }
}
class CabService extends Transport{
    double monthlyCharge;
    double perKmRate;
    double calculateFare(){
        return monthlyCharge + (distance * perKmRate);
    }
}
class BikeService extends Transport{
    double perKmRate;
    double calculateFare(){
        return distance * perKmRate;
    }
}
public class TechRide{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose service (cab/bike): ");
        String choice=sc.next();
        System.out.print("Enter driver name: ");
        String name=sc.next();
        System.out.print("Enter distance (km): ");
        double dist=sc.nextDouble();
        if(choice.equalsIgnoreCase("cab")){
            CabService c=new CabService();
            c.driverName=name;
            c.distance=dist;
            System.out.print("Enter monthly charge: ");
            c.monthlyCharge=sc.nextDouble();
            System.out.print("Enter per km rate: ");
            c.perKmRate=sc.nextDouble();
            c.displayDetails();
            System.out.println("Calculated Fare: "+c.calculateFare());
        }
        else{
            BikeService b=new BikeService();
            b.driverName=name;
            b.distance=dist;
            System.out.print("Enter per km rate: ");
            b.perKmRate=sc.nextDouble();
            b.displayDetails();
            System.out.println("Calculated Fare: "+b.calculateFare());
        }
    }
}
