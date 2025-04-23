public class Books extends Product {
    String author;
    String genre;

    Books(String name, Double price, String author, String genre) {
        super(name, price);
        this.author = author;
        this.genre = genre;
    }

    void readSampleChapter() {
        System.out.println("Reading a sample chapter from \"" + name + "\" by " + author + ":");
        System.out.println("--------------------");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("--------------------");
    }
}
