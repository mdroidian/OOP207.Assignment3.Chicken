import java.util.ArrayList;
import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
    
    // menu 1
    Chicken c1 = new Chicken("Butter Chicken", 15);
    Chicken c2 = new Chicken("Tandoori Chicken", 15);
    Collections ChickenItems = new Collections("Chicken");
    ChickenItems.addProduct(c1);
    ChickenItems.addProduct(c2);
    
    // menu 2
    Vegan v1 = new Vegan("Vegan Item one", 10);
    Vegan v2 = new Vegan("Vegan Item Two", 25);
    Collections VeganItems = new Collections("Vegan");
    VeganItems.addProduct(v1);
    VeganItems.addProduct(v2);
    
    // Print the menus 
    
    TheMenu menu = new TheMenu();
    menu.addCollection(ChickenItems);
    menu.addCollection(VeganItems);
    System.out.println(menu.printMenu());
    
    // Get Order

    Order order = new Order();

    // Don't have the Java knowledge to put this in separate class / interface
    String nextItem = "";
    System.out.println("Place your next order.");
    System.out.println("For example, Type 01 for \"Butter Chicken\".");
    System.out.println("Type \"D\" To Finish");
    
    // Scanner sc = new Scanner(System.in);
    // nextItem = sc.nextLine();
    // System.out.println(nextItem);

    while(!nextItem.equals("D")) {
        Scanner sc = new Scanner(System.in);
        nextItem = sc.nextLine();

        if (!nextItem.equals("D")) {
        int collectionIndex = Character.getNumericValue(nextItem.charAt(0));

        int itemIndex = Character.getNumericValue(nextItem.charAt(1));

        order.add(menu.getProduct(collectionIndex, itemIndex));
        }
    }

    order.printOrder();
    order.printTotal();


        
}
}
