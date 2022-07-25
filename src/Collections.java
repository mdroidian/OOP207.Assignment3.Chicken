import java.util.ArrayList;

public class Collections {

    private String title;
    private ArrayList<Item> productArray;
    
    public Collections(String title) {
        this.title = title;
        this.productArray = new ArrayList<Item>();
    }


    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public ArrayList<Item> getProductCollection() {
        return this.productArray;
    }
    
    public void setProducts(ArrayList<Item> productCollection) {
        this.productArray = productCollection;
    }
    
    public void addProduct(Item product) {
        this.productArray.add(product);
    }
    
    public void removeProduct(Item product) {
        this.productArray.remove(product);
    }
}