package O_Room;

import java.util.*;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room id: ");
        id = sc.nextLine();

        System.out.print("Enter room name: ");
        name = sc.nextLine();

        System.out.print("Enter base cost: ");
        baseCost = sc.nextDouble();
    }

    public void output() {
        System.out.println("Room ID: " + id);
        System.out.println("Room Name: " + name);
        System.out.println("Base Cost: " + baseCost);
        System.out.println("Total Cost: " + calculateCost());
    }

    public double calculateCost() {
        return baseCost; // hiện tại chỉ trả về baseCost
    }
}
