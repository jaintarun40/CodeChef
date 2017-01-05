/**
 * Created by USER on 26-08-2016.
 */
abstract class Vehicle {
    int noOfWheels;
    abstract void start();
}
class Bike extends Vehicle
{
    Bike()
    {
        noOfWheels=2;
    }
    void start()
    {
        System.out.println("Bike started");
        System.out.println("No of wheels= "+noOfWheels);
    }
}
class Car extends Vehicle{
    Car()
    {
        noOfWheels=4;
    }
    void start()
    {
        System.out.println("Car started");
        System.out.println("No of wheels= "+noOfWheels);
    }

    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.start();
        v1=new Bike();
        v1.start();
    }
}
