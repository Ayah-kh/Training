package DesignPatterns.factory2;

public class MotorCycleFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}
