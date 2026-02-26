package O_Room;

public class MeetingRoom extends Room {
    private int capacity; 
    public MeetingRoom() {} 
    public MeetingRoom(String id, String name, double baseCost, int capacity) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; } 
    public void setCapacity(int capacity) { this.capacity = capacity; }

    @Override
    public void addRoom() {
        super.addRoom(); 
        System.out.print("Enter Capacity: ");
        setCapacity(sc.nextInt()); 
        sc.nextLine();
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("Enter New Capacity: ");
        setCapacity(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Capacity: " + getCapacity());
    }
}

