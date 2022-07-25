// import java.util.Scanner;
import java.util.ArrayList;

public class Order {
    
    private ArrayList<Item> order;

    public Order() {
      this.order = new ArrayList<Item>();
    }

    public void add(Item item) {
        this.order.add(item);
    }

    public void printOrder() {
        String orderContent = "";
        orderContent += "Your Order: \n";

        for (int i = 0; i < this.order.size(); i++) {
            Item product = this.order.get(i);
            orderContent += String.format("%-5d%-20s$%.2f%s", (i + 1), product.getTitle(), product.getPrice(), "\n");
        }

        System.out.println(orderContent);
    }

    public void printTotal() {
        int total = 0;

        
        for (int i = 0; i < this.order.size(); i++) {
            Item product = this.order.get(i);
            total += product.getPrice();
        }

        System.out.println("Your Total: $" + total);
    }   

    // String nextItem = "";

    // public void getItem() {
    //     System.out.println("Place your next order.  Type \"D\" To Finish");
        
    //     while(!nextItem.equals("D")) {
    //         Scanner sc = new Scanner(System.in);
    //         nextItem = sc.nextLine();
    //         if (nextItem.equals(1)) {
    //             this.order.add(v1); //cannot add object here
    //         }
    //     }
            
    // }

	// public ArrayList<String> printOrder() {
    //     return this.order;
	// }

    
}
