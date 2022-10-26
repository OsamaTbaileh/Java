import java.util.*;

public class Exceptions {
    public static void main (String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i=0; i<myList.size(); i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
            }
            catch(Exception e){
                System.out.println("***The error message:");
                e.printStackTrace();
                System.out.println("***The exception index: " + i);
                System.out.println("***The exception value: " + myList.get(i));
            }
        }
    }
}
