package O_Room;

import java.util.Scanner;

public class BedRoom extends Room {
    private int numberOfBeds;

    @Override
    public void addRoom() {
        super.addRoom(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Beds: ");
        numberOfBeds = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Beds: " + numberOfBeds);
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}


