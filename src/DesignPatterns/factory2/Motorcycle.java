package DesignPatterns.factory2;

//Concrete Product A
public class Motorcycle implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
