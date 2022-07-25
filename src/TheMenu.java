import java.util.ArrayList;

public class TheMenu {
  private ArrayList<Collections> menuCollections;

  public TheMenu() {
    this.menuCollections = new ArrayList<Collections>();
  }

  public void addCollection(Collections menuCollection) {
    this.menuCollections.add(menuCollection);
  }

  public void removeCollection(Collections menuCollection) {
    this.menuCollections.remove(menuCollection);
  }

  public String printMenu() {
    String menuContent = "";

    for (int i = 0; i < this.menuCollections.size(); i++) {
      if (i > 0) {
        menuContent += "\n";
      }

      Collections menuCollection = this.menuCollections.get(i);
      menuContent += menuCollection.getTitle() + "\n";
      menuContent += String.format("%s %-5s%-20s%s%s", "#", "#", "Product Name", "Product Price", "\n");
      ;
      for (int j = 0; j < menuCollection.getProductCollection().size(); j++) {
        Item product = menuCollection.getProductCollection().get(j);
        // menuContent += String.format("%-5d%-20s$%.2f%s", (j + 1), product.getTitle(), product.getPrice(), "\n");
        menuContent += String.format("%s %-5d%-20s$%.2f%s",  i, (j), product.getTitle(), product.getPrice(), "\n");
      }
    }
    
    return menuContent;
  }

  public ArrayList<Collections> getMenuCollections() {
      return this.menuCollections;
  }

  public Item getProduct(int collectionIndex, int itemIndex) {
    Collections collection = this.menuCollections.get(collectionIndex);
    return collection.getProductCollection().get(itemIndex);
  }
}

