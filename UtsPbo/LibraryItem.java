//package untuk mengorganisir dan mengelompokkan class-class
package UtsPbo;

//superclass yang akan di inheritance oleh subclass book
public class LibraryItem {
    private String title; // encapsulasi ditandai adanya variabel title yang dimodifier private

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() { // diakses dengan method getTitle()
        return title;

    }
}
