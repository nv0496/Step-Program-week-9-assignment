import java.util.*;

class Book implements Cloneable {
    String title;

    Book(String title) {
        this.title = title;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return title;
    }
}

class Library implements Cloneable {
    List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    protected Object clone() throws CloneNotSupportedException {
        List<Book> copiedBooks = new ArrayList<>();
        for (Book b : books)
            copiedBooks.add((Book) b.clone());
        return new Library(copiedBooks);
    }

    public String toString() {
        return books.toString();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Java"));
        list.add(new Book("Python"));
        Library lib1 = new Library(list);
        Library lib2 = (Library) lib1.clone();
        System.out.println("Original: " + lib1);
        System.out.println("Cloned: " + lib2);
        lib2.books.get(0).title = "C++";
        System.out.println("After modification:");
        System.out.println("Original: " + lib1);
        System.out.println("Cloned: " + lib2);
    }
}
