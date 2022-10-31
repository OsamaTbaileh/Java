import java.util.*;

class CoffeeKiosk{
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    // contructor:
    CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }



    // methods:
    public void addMenuItem(String myName, double myPrice){
        Item myItem = new Item(myName, myPrice);
        this.menu.add(myItem);
        myItem.setIndex(menu.size()-1);
    }

    public void displayMenu(){
        for(int i=0; i<menu.size(); i++){
            System.out.println(i + " " + menu.get(i).getName() + " -- $" + menu.get(i).getPrice());
        }
    }

    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        Order order = new Order(name);
        this.orders.add(order);
        displayMenu();


        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        while(!itemNumber.equals("q")) {
            Item item = this.menu.get(Integer.parseInt(itemNumber));
            order.addItem(item);
            System.out.println("Enter another menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }

        order.display();

}
}