package carapp;

import carapp.models.Car;

public class Application {

    public static void main(String[] args) {
            System.out.println("Welcome to the Car Application!");

            Car bmw = new Car("4SRL16");
            bmw.setOwnerOfCar("Jeffrey");

            Car ferrari = new Car("HHH888");
            ferrari.setOwnerOfCar("Daniel");

            String bmwDetails = bmw.getCarDetails();
            //System.out.println(bmwDetails);

            String ferrariDetails = ferrari.getCarDetails();
            //System.out.println(ferrariDetails);




            int current = 0;
            int max = 20;

            while(current < max) {
                    current++;
                    //System.out.println("Current amount is " + current);
            }

            Car[] cars = new Car[3];
            cars[0] = ferrari;
            cars[1] = bmw;
            cars[2] = new Car("sfdgdfgh");

            for(Car currentCar : cars) {
                    String details = currentCar.getCarDetails();
                    System.out.println(details);
            }

            for (int i = 0; i < cars.length; i++) {
                Car selectedCar = cars[i];
                System.out.println(selectedCar.getCarDetails());
            }

     }
}