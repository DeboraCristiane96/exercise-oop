public class Vehicle {
    public boolean engine;
    public boolean steeringWheel;
    public int numberOfPassengers;
    public int numberOfWheels;
    public boolean itsLoad;
    public int loadCapacity;

    public Fuel fuel;

    public Vehicle(boolean engine, boolean steeringWheel, int numberOfPassengers, int numberOfWheels, boolean itsLoad, int loadCapacity) {
        this.engine = engine;
        this.steeringWheel = steeringWheel;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.itsLoad = itsLoad;
        this.loadCapacity = loadCapacity;
    }

    public boolean isEngine() {
        return this.engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public boolean isSteeringWheel() {
        return this.steeringWheel;
    }

    public void setSteeringWheel(boolean steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isItsLoad() {
        return this.itsLoad;
    }

    public void setItsLoad(boolean itsLoad) {
        this.itsLoad = itsLoad;
    }

    public float getLoadCapacity() {
        return (float)this.loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Fuel getFuel() {
        return fuel;}

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    //Método para confirmar
    public boolean confirmOrDeny(String option){
        if (option.equals("Y") || option.equals("y")){return true;} return false;}

    public Fuel petrolOrDiesel(Fuel fuel, String option) {
        if (option.equals("1")) {
            fuel.setPetrol(true);
        } else if (option.equals("2")) {
            fuel.setDiesel(true);
        }
        return fuel;
    }

}
