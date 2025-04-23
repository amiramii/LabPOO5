import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Electronics laptop = new Electronics("Laptop", 1500.00, "Dell", 2);
        Books novel = new Books("The Great Gatsby", 15.99, "F. Scott Fitzgerald", "Classic Literature");
        Clothing tShirt = new Clothing("T-Shirt", 19.99, "L", "Cotton");

        Customer customer = new Customer("mohammed", "moh@email.com", "****");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add to Cart");
            System.out.println("2. Add to Wishlist");
            System.out.println("3. View Cart");
            System.out.println("4. View Wishlist");
            System.out.println("5. Apply Discount");
            System.out.println("6. Leave Review");
            System.out.println("7. Purchase");
            System.out.println("8. Display Details");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Available products:");
                    System.out.println("1. Laptop");
                    System.out.println("2. The Great Gatsby");
                    System.out.println("3. T-Shirt");
                    System.out.print("Enter the product number to add to cart: ");
                    int productChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    if (productChoice == 1) {
                        customer.addToCart(laptop);
                    } else if (productChoice == 2) {
                        customer.addToCart(novel);
                    } else if (productChoice == 3) {
                        customer.addToCart(tShirt);
                    }
                    break;
                case 2:
                    System.out.println("Available products:");
                    System.out.println("1. Laptop");
                    System.out.println("2. The Great Gatsby");
                    System.out.println("3. T-Shirt");
                    System.out.print("Enter the product number to add to wishlist: ");
                    productChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    if (productChoice == 1) {
                        customer.addToWishlist(laptop);
                    } else if (productChoice == 2) {
                        customer.addToWishlist(novel);
                    } else if (productChoice == 3) {
                        customer.addToWishlist(tShirt);
                    }
                    break;
                case 3:
                    customer.viewCart();
                    break;
                case 4:
                    customer.viewWishlist();
                    break;
                case 5:
                    System.out.print("Enter the product number to apply a discount (1. Laptop, 2. The Great Gatsby, 3. T-Shirt): ");
                    productChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    if (productChoice == 1) {
                        laptop.applyDiscount(scanner);
                    } else if (productChoice == 2) {
                        novel.applyDiscount(scanner);
                    } else if (productChoice == 3) {
                        tShirt.applyDiscount(scanner);
                    }
                    break;
                case 6:
                    System.out.print("Enter the product number to leave a review (1. Laptop, 2. The Great Gatsby, 3. T-Shirt): ");
                    productChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    if (productChoice == 1) {
                        laptop.leaveReview(scanner);
                    } else if (productChoice == 2) {
                        novel.leaveReview(scanner);
                    } else if (productChoice == 3) {
                        tShirt.leaveReview(scanner);
                    }
                    break;
                case 7:
                    System.out.print("Enter the product number to purchase (1. Laptop, 2. The Great Gatsby, 3. T-Shirt): ");
                    productChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    if (productChoice == 1) {
                        customer.purchse(laptop);
                    } else if (productChoice == 2) {
                        customer.purchse(novel);
                    } else if (productChoice == 3) {
                        customer.purchse(tShirt);
                    }
                    break;
                case 8:
                    System.out.print("Enter the product number to display details (1. Laptop, 2. The Great Gatsby, 3. T-Shirt): ");
                    productChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (productChoice == 1) {
                        laptop.displayDetails();
                    } else if (productChoice == 2) {
                        novel.displayDetails();
                    } else if (productChoice == 3) {
                        tShirt.displayDetails();
                    }
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        
        scanner.close();
    }
}
