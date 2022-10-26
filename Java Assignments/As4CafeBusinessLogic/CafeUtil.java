import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i=1; i<=11; i++){
            sum = sum + i;
        }
        return sum;
    } 

    public double getOrderTotal(double [] prices){
        double sum = 0;
        for (int i=0; i<prices.length-1; i++){
            sum = sum + prices[i];
        }
        return sum;
    }

    public void displayMenu (ArrayList<String> menuItems) {
        for (int i=0; i< menuItems.size();i++){
            System.out.println(i + " "+ menuItems.get(i));
        }
    }

    public String addCustomer(ArrayList<String> addCustomer){
        System.out.println("PLease enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName +"!" );
        System.out.println(String.format("There are %s people infront of you", addCustomer.size()));
        addCustomer.add(userName);
        System.out.println(addCustomer);
    return userName;
    }
}

