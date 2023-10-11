package DesignPatterns.factory2;

//Concrete Product B
public class Car implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
