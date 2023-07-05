public class Car extends Vehicle {

    public boolean radio;
    public boolean airConditioning;

    public Car(boolean engine, boolean steeringWheel, int numberOfPassengers, int numberOfWheels, boolean itsLoad, int loadCapacity) {
        super(engine, steeringWheel, numberOfPassengers, numberOfWheels, itsLoad, loadCapacity);
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car { " + "\n"+
                "  Radio = " + radio + "\n"+
                ", Air Conditioning = " + airConditioning + "\n"+
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
