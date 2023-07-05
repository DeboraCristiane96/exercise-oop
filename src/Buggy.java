public class Buggy extends Vehicle{


    public Buggy(boolean engine, boolean steeringWheel, int numberOfPassengers, int numberOfWheels, boolean itsLoad, int loadCapacity) {
        super(engine, steeringWheel, numberOfPassengers, numberOfWheels, itsLoad, loadCapacity);
    }

    @Override
    public String toString() {
        return "Buggy{ " + "\n"+
                "  Engine = " + engine + "\n"+
                ", Steering Wheel = " + steeringWheel + "\n"+
                ", Number Of Passengers = " + numberOfPassengers + "\n"+
                ", Number Of Wheels = " + numberOfWheels + "\n"+
                ", It's Load=" + itsLoad + "\n"+
                ", Load Capacity = " + loadCapacity +"\n"+
                ", Fuel = " + fuel +
                '}';
    }
}
