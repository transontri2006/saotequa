package room;
import java.util.Scanner;

public class MeetingRoom extends Room {
    private int capacity;

    @Override
    public void addRoom() {
        Scanner sc = new Scanner(System.in);
        super.addRoom();
        System.out.print("Capacity: ");
        capacity = sc.nextInt();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }
}
