public class Truck extends Vehicle {
    public int numberOfAxles;

    public Truck(boolean engine, boolean steeringWheel, int numberOfPassengers, int numberOfWheels, boolean itsLoad, int loadCapacity) {
        super(engine, steeringWheel, numberOfPassengers, numberOfWheels, itsLoad, loadCapacity);
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public String toString() {
        return  "Truck{" + "\n"+
                "  Number Of Axles = " + numberOfAxles + "\n"+
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
