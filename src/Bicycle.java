public class Bicycle extends Vehicle{
    public boolean itsElectric;
    public boolean itHasLuggageRack;
    public Bicycle(boolean engine, boolean steeringWheel, int numberOfPassengers, int numberOfWheels, boolean itsLoad, int loadCapacity) {
        super(engine, steeringWheel, numberOfPassengers, numberOfWheels, itsLoad, loadCapacity);
    }

    public boolean isItsElectric() {
        return itsElectric;
    }

    public void setItsElectric(boolean itsElectric) {
        this.itsElectric = itsElectric;
    }

    @Override
    public String toString() {
        return "Bicycle{ " +
                "  It's Electric = " + itsElectric + "\n"+
                ", It Has Luggage Rack = " + itHasLuggageRack + "\n"+
                ", Engine = " + engine + "\n"+
                ", Steering Wheel = " + steeringWheel + "\n"+
                ", Number Of Passengers = " + numberOfPassengers + "\n"+
                ", Number Of Wheels = " + numberOfWheels + "\n"+
                ", It's Load = " + itsLoad + "\n"+
                ", Load Capacity = " + loadCapacity + "\n"+
                ", Fuel = " + fuel +
                '}';
    }

    public boolean isItHasLuggageRack() {
        return itHasLuggageRack;
    }

    public void setItHasLuggageRack(boolean itHasLuggageRack) {
        this.itHasLuggageRack = itHasLuggageRack;
    }
}
