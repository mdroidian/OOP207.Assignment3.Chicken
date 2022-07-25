public class Vegan implements Item {

    String type = "Vegan";
    String title;
    double price;
  
    public Vegan(String title, double price) {
      this.title = title;
      this.price = price;
    }
  
    public String getType() {
      return this.type;
    }
  
    public String getTitle() {
      return this.title;
    };
  
    public double getPrice() {
      return this.price;
    };
  
    public void setTitle(String title) {
      this.title = title;
    };
  
    public void setPrice(double price) {
      this.price = price;
    };
  }