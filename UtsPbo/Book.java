package UtsPbo;

//subclass yang mengextend superclass
public class Book extends LibraryItem { // inheritance ditandai adanya extends dari class Book ke superclass LibraryItem
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        super(title);
        this.author = author;
        this.isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // polymorphism ditandai adanya overrid method getTitle() dari method getTitle()
    // superclass LibraryItem
    @Override
    public String getTitle() {
        return super.getTitle();
    }
}
