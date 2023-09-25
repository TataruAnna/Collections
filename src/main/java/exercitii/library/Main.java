package exercitii.library;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(2000,"Titlu1", "Autor1", Genre.SF);
        Book book2 = new Book(2005,"Titlu2", "Autor1", Genre.SCIENCE);
        Book book3 = new Book(2010,"Titlu3", "Autor2", Genre.THRILLER);
        Book book4 = new Book(1985,"Titlu4", "Autor2", Genre.SCIENCE);
        Book book5 = new Book(1985,"Titlu5", "Autor5", Genre.SCIENCE);
        Book book6 = new Book(1985,"Titlu5", "Autor3", Genre.ROMANCE);
        Book book7 = new Book(1985,"Titlu5", "Autor5", Genre.SF);
        BookStore bookStore = new BookStore();
        try {
            bookStore.addBook(book1);
            bookStore.addBook(book2);
            bookStore.addBook(book3);
            bookStore.addBook(book4);
            bookStore.addBook(book5);
            bookStore.addBook(book6);
            bookStore.addBook(book7);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(bookStore);
        System.out.println();
        System.out.println(bookStore.getAllBooksOrderedByYear());
        System.out.println();
        System.out.println(bookStore.getAllGenres());
        System.out.println();
        System.out.println(bookStore.getAllBooksOrderedByAuthor());
        System.out.println();
        System.out.println(bookStore.getAllBooksByGenre());
        System.out.println();
        try {
            System.out.println(bookStore.getBooksByGenre(Genre.SF));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
