package O_Room;
import java.util.Scanner;

public abstract class Room implements IRoom {
    private String id; 
    private String name; 
    private double baseCost;
    protected Scanner sc = new Scanner(System.in); 

    public Room() {} 

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;

    public String getId() {
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBaseCost() { return baseCost; }
    public void setBaseCost(double baseCost) { this.baseCost = baseCost; }

    @Override
    public void addRoom() {
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter Name: ");
        setName(sc.nextLine());
        System.out.print("Enter Base Cost: ");
        setBaseCost(sc.nextDouble());
        sc.nextLine(); // Consume newline
    }

    @Override
    public void updateRoom() {
        System.out.print("Enter New Name: ");
        setName(sc.nextLine()); 
        System.out.print("Enter New Base Cost: ");
        setBaseCost(sc.nextDouble()); 
        sc.nextLine(); // Consume newline
    }

    @Override
    public void displayDetails() {
        System.out.print("ID: " + getId() + ", Name: " + getName() + ", Base Cost: " + getBaseCost());
    }
}


