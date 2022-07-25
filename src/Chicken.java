public class Chicken implements Item {
  
    String type = "Chicken";
    String title;
    double price;
  
    public Chicken(String title, double price) {
      this.title = title;
      this.price = price;
    }
  
    public String getType() {
      return this.type;
    }
  
    public String getTitle() {
      return this.title;
    }
  
    public double getPrice() {
      return this.price;
    }
  
    public void setTitle(String title) {
      this.title = title;
    }
  
    public void setPrice(double price) {
      this.price = price;
    }
  }