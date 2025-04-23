public class Electronics extends Product {
    String brand;
    int warrantyPeriod;

    // Constructor with corrected syntax
    Electronics(String name, Double price, String brand, int warrantyPeriod) {
        super(name, price);  // Call the superclass constructor
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    void showSpecifications(){
        super.displayDetails();
        System.out.println(brand);
        System.out.println(warrantyPeriod);
        System.out.println("--------------------");
    }
}

