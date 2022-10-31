import java.util.ArrayList;
import java.util.*;

class Order {
    private String name;
    private boolean ready;
    private double total;
    private ArrayList<Item> items = new ArrayList<Item>();



    // constructors:
    Order () {
        this. name = "Guest";
        this.items = new ArrayList<Item>();
    }

    Order (String name) {
        this.name = name;
    }



    // getters:
    public String getName() {
        return name;
    }

    public boolean isReady() {
        return ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }



    // setters:
    public void setName(String name) {
        this.name = name;
    } 

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }



    // methods:
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready){
            return "Your order is ready";
        }
        else {
            return "Thank you for waiting, your order will be ready soon!";
        }
    }

    public void display() {
        System.out.printf("Customer Name: %s \n",this.name);
        for(int i = 0; i<items.size(); i++){
            System.out.println(items.get(i).getName() + " - " + items.get(i).getPrice());
        }
        System.out.println("Total: " + getOrderTotal());
    }

    public double getOrderTotal(){
        for(int i = 0; i<items.size(); i++){
            this.total += items.get(i).getPrice();
        }
        return this.total;
    }
}
