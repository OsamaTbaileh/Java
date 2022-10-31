import java.util.ArrayList;

public class TestOrders {
    public static void main (String[] args) {
        // Order order1 = new Order();
        // Order order2 = new Order();

        // Order order3 = new Order("Shatha");
        // Order order4 = new Order("Mariam");
        // Order order5 = new Order("Aseel");

        // Item item1 = new Item("Cuppuciona", 1.5);
        // Item item2 = new Item("Latte", 2);
        // Item item3 = new Item("Coffee", 3);

        // order1.addItem(item3);
        // order1.addItem(item3);
        // order2.addItem(item3);
        // order2.addItem(item3);
        // order3.addItem(item3);
        // order3.addItem(item3);
        // order4.addItem(item3);
        // order4.addItem(item3);
        // order5.addItem(item3);
        // order5.addItem(item3);


        // order5.display();
        // System.out.println(order1.getStatusMessage());


        // order2.setReady(true);
        // System.out.println(order2.getStatusMessage());


        CoffeeKiosk coffeKioskTest = new CoffeeKiosk();
        coffeKioskTest.addMenuItem("Green Tea", 3);
        coffeKioskTest.addMenuItem("Hot Choclate", 4);
        coffeKioskTest.addMenuItem("Americano", 5.5);
        coffeKioskTest.addMenuItem("Espresso", 6);
        coffeKioskTest.addMenuItem("latte", 5);
        coffeKioskTest.newOrder();

    }
}
