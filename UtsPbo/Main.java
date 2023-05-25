package UtsPbo;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book.setAvailable(true);

        System.out.println("Title           : " + book.getTitle());
        System.out.println("Author          : " + book.getAuthor());
        System.out.println("Availability    : " + book.isAvailable());
    }
}
