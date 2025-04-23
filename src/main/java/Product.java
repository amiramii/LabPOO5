import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Product {
    Random random = new Random();
    String name;
    Double price;
    int sku;
    ArrayList<String> reviews=new ArrayList<String>();
    Product(String name,Double price){
        this.name=name;
        this.price=price;
        this.sku=random.nextInt(0,1000000000);
        this.reviews=reviews;
    }
    public  void displayDetails(){
        System.out.println("--------------------");
        System.out.println("Product Details:");
        System.out.println("Name: " +name);
        System.out.println("Price: $" +price);
        System.out.println("SKU: " + sku);
        System.out.println("Some reviews about this product");
        for(String e:reviews){
            System.out.println("customer : "+e);
        }
        
        
    }
    public void applyDiscount(Scanner  scanner){
        
        System.out.println("Enter a discount code");
        scanner.nextLine();
        price=(price*30)/100;
        System.out.println("the price of product after discount is :");
        System.out.println(price);
    }
    public void leaveReview(Scanner  scanner){
        System.out.println("Enter a review or ure opinion about this product");
        reviews.add(scanner.nextLine());
        
    }
}
