public class Clothing extends Product{
    String size;
    String material;
    Clothing(String name,Double price,String size,String material){
        super(name,price);
        this.size=size;
        this.material=material;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size : "+size);
        System.out.println("Material : "+material);
        System.out.println("--------------------");
        
    }
}