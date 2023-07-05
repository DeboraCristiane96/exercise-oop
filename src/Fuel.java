public class Fuel {

    public boolean petrol;
    public boolean alcohol;
    public boolean diesel;
    public boolean electricity;
    public boolean human;
    public boolean animal;

    public boolean isPetrol() {
        return petrol;
    }

    public void setPetrol(boolean petrol) {
        this.petrol = petrol;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isElectricity() {
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "{" + "\n"+
                "  Petrol = " + petrol + "\n"+
                ", Alcohol = " + alcohol + "\n"+
                ", Diesel = " + diesel + "\n"+
                ", Electricity = " + electricity + "\n"+
                ", Human = " + human + "\n"+
                ", Animal = " + animal + "\n"+
                '}';
    }
}
