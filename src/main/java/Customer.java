
import java.util.ArrayList;

public class Customer {
    String name;
    String email;
    String pswd;
    ArrayList<Product> cart=new ArrayList<>();
    ArrayList<Product> wishList=new ArrayList<>();
    Customer(String name,String email,String pswd){
        this.name=name;
        this.email=email;
        this.pswd=pswd;
        this.cart=cart;
        this.wishList=wishList;
    }
    void addToCart(Product product){
        cart.add(product);
        if(wishList.contains(product)){
            wishList.remove(product);
        }   
        System.out.println("Added to your cart");
    }
    void addToWishlist(Product product){
        wishList.add(product);
        System.out.println("Added to your wish list");
        
    }
    void viewCart(){
        System.out.println("Your cart : ");
        for(Product e:cart){
            System.out.println(e.name);
        }
    }
    void viewWishlist(){
        System.out.println("Your wishlist : ");
        for(Product e:wishList){
            System.out.println(e.name);
        }
    }
    void purchse(Product product){
        System.out.println("U purchased this product successfully");
        if(cart.contains(product)){
            cart.remove(product);
        }  
    }
    
}
