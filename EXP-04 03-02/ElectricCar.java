class Vehicle{
    void vehicleType(){
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle{
    void carType(){
        System.out.println("This is a car");
    }
}
public class ElectricCar extends Car{
    void electricFeature(){
        System.out.println("This is an electric car");
    }
    public static void main(String[] args){
        ElectricCar e=new ElectricCar();
        e.vehicleType();
        e.carType();
        e.electricFeature();
    }
}

