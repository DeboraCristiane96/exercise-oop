public class Bike extends Vehicle  {

    public boolean electricStart;

    public Bike(boolean engine, boolean steeringWheel, int numberOfPassengers, int numberOfWheels, boolean itsLoad, int loadCapacity) {
        super(engine, steeringWheel, numberOfPassengers, numberOfWheels, itsLoad, loadCapacity);

    }

    public boolean isElectricStart() {
        return electricStart;
    }

    public void setElectricStart(boolean electricStart) {
        this.electricStart = electricStart;
    }

    @Override
    public String toString() {
        return "Bike{" + "\n"+
                "  Electric Start = " + electricStart + "\n"+
                ", Engine = " + engine + "\n"+
                ", Steering Wheel = " + steeringWheel + "\n"+
                ", Number Of Passengers = " + numberOfPassengers + "\n"+
                ", Number Of Wheels = " + numberOfWheels + "\n"+
                ", It's Load = " + itsLoad + "\n"+
                ", Load Capacity = " + loadCapacity + "\n"+
                ", Fuel = " + fuel +
                '}';
    }





}
