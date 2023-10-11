package DesignPatterns.factory2;

public abstract class MotorVehicleFactory {

    protected abstract MotorVehicle createMotorVehicle();

    public MotorVehicle create(){
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }
}
