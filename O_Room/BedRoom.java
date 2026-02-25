package O_Room;
import java.util.Scanner;

public class BedRoom extends Room {
    private int numberOfBeds;
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        super.addRoom(); 
        
        System.out.print("Beds: ");
        if (sc.hasNextInt()) {
            this.numberOfBeds = sc.nextInt();
        }
        sc.nextLine(); // 
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Beds: " + numberOfBeds);
    }
}

