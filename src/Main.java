import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Variaveis
        String message = "What type of fuel do you use? "+"\n"+"1- Petrol"+"\n"+"2- Diesel: ";
        String option; int axles;
        //Objetos
        Fuel fuel = new Fuel();
        Car car = new Car(true,true,5,4,false,1100);
        Truck truck = new Truck(true,true,2,4,true,12000);
        Bike bike = new Bike(true,false,2,2,false,150);
        Bicycle bicycle = new Bicycle(false,false,1,2,false,60);
        Buggy buggy = new Buggy(false,false,4,4,true,100);
        System.out.print("Hello, Good Morning!"+"\n"+"Could you give me some information about your vehicle? "
                +"\n"+"[Y/N]: ");
               option = input.next();
        if(option.equals("Y") || option.equals("y")){
            System.out.println("Which one is you own: "+"\n"+"1- Car"+"\n"+"2- Truck "+"\n"+"3- Bike"+"\n"
                    +"4- Bicycle"+"\n"+"5- Buggy ");
                option = input.next();
            switch (option) {
                case "1" -> {
                    System.out.println("Do you have air conditioning? " + "\n" + "[Y/N]: ");
                    option = input.next();
                    car.setAirConditioning(car.confirmOrDeny(option));
                    System.out.println("has radio? " + "\n" + "[Y/N]: ");
                    option = input.next();
                    car.setRadio(car.confirmOrDeny(option));
                    System.out.println(message);
                    // o veiculo vai receber o tipo de combustível
                    option = input.next();
                    car.setFuel(car.petrolOrDiesel(fuel, option));
                    System.out.println(car.toString());
                }
                case "2" -> {
                    System.out.println("How many axles?");
                    axles = input.nextInt();
                    truck.setNumberOfAxles(axles);
                    System.out.println(message);
                    // o veiculo vai receber o tipo de combustível
                    option = input.next();
                    truck.setFuel(truck.petrolOrDiesel(fuel, option));
                    System.out.println(truck.toString());
                }
                case "3" -> {
                    System.out.println("Your bike has electric starter? [Y/N]: ");
                    option = input.next();
                    bike.setElectricStart(bike.confirmOrDeny(option));
                    System.out.println(message);
                    // o veiculo vai receber o tipo de combustível
                    option = input.next();
                    bike.setFuel(bike.petrolOrDiesel(fuel, option));
                    System.out.println(bike.toString());
                }
                case "4" -> {
                    System.out.println("Is your bike electric? [Y/N]: ");
                    option = input.next();
                    bicycle.setItsElectric(bicycle.confirmOrDeny(option));
                    System.out.println("Does your bike have a luggage rack? [Y/N]: ");
                    option = input.next();
                    bicycle.setItHasLuggageRack(bicycle.confirmOrDeny(option));
                    fuel.setHuman(true);
                    bicycle.setFuel(fuel);
                    System.out.println(bicycle.toString());
                }
                case "5" -> {
                    fuel.setAnimal(true);
                    buggy.setFuel(fuel);
                    System.out.println(buggy.toString());
                }
                default -> System.out.println("ERROR!");
            }
            }
                System.out.println("Thank you for your attention!");
    }
}