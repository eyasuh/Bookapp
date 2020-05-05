public class BookClass {
    // data fields
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //default constructor
    public BookClass() {}

    //constructor
    public BookClass(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    // setter and getters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    //
    public String getDisplayText() {
        return getAuthor() + getTitle() + getDescription();
    }
}
