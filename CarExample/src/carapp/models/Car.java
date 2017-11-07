package carapp.models;

import java.util.concurrent.TimeUnit;

/*
Class Car, represents a car with a license plate and an owner.
Author: Rick Artz, 06/11/2017
 */
public class Car {

    String licensePlate;
    String ownerName;
    double speed = 0;




    /*
    Car constructor, inits a car with license plate.
     */
    public Car(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
        this.currentAmount = 0;
    }

    // setOwnerOfCar with owner name.
    public void setOwnerOfCar(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    // Return details of car (license, owner).
    public String getCarDetails() {

        // Add needed values to string to return.
        String toReturn = "This car has license plate ";
        toReturn = toReturn + this.licensePlate;
        toReturn = toReturn + " and the owner is called ";
        toReturn += this.ownerName;

        return toReturn;
    }

    double currentAmount = 20.0;
    double maxAmount = 50.0;
    boolean tankDopErop = true;
    boolean tankPasErin = true;

    public void fillTank(double amountLitre) {

        boolean validAmount = amountLitre > 2;

        if (validAmount) {
            // valide tankbeurt
        }
        else {
            // Invalid tank.
        }
    }





}
