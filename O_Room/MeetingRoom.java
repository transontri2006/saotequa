package O_Room;

import java.util.Scanner;

public class MeetingRoom extends Room {

    private int capacity;
    private Scanner sc = new Scanner(System.in);

    public MeetingRoom() {
        super();   // gọi constructor rỗng của Room
    }

    public MeetingRoom(String id, String name, double baseCost, int capacity) {
        super(id, name, baseCost);  // gọi constructor 3 tham số của Room
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void addRoom() {
        super.addRoom();   // nhập id, name, baseCost
        System.out.print("Enter capacity: ");
        capacity = sc.nextInt();
        sc.nextLine();     // clear buffer
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("Update capacity: ");
        capacity = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }
}