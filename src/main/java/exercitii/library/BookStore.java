package exercitii.library;

import java.util.*;

public class BookStore {
    Set<Book> bookSet;

    public BookStore() {
        this.bookSet = new HashSet<>();
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    //addBook
    public void addBook(Book book)throws Exception{
        if(bookSet.contains(book)){
            throw new Exception("Cartea exista deja");
        }
        bookSet.add(book);
    }

    //deleteBook
    public void deleteBook(Book book) throws Exception{
        if(!bookSet.contains(book)){
            throw new Exception("Cartea nu exista");
        }
        bookSet.remove(book);
    }


    //getAllBooksOrderedByYear()
    public List<Book> getAllBooksOrderedByYear(){
//        return new TreeSet<>(bookSet);
       // booksOrderedByYear.addAll(bookSet);
        List<Book> orderedListByYear =new ArrayList<>(bookSet);
        Collections.sort(orderedListByYear);
        return orderedListByYear;

    }

    //getAllGenres()
    public Set<Genre> getAllGenres(){
        Set<Genre> allGenres = new HashSet<>();
        for (Book book : bookSet){
            allGenres.add(book.getGenre());
        }
        return allGenres;
    }

    //getAllBooksOrderedByAuthor()
    public List<Book> getAllBooksOrderedByAuthor(){

        List<Book> booksOrderedByAuthor= new ArrayList<>(bookSet);
        booksOrderedByAuthor.sort(new AuthorComparator());
        return booksOrderedByAuthor;
    }

    //getAllBooksByGenre()
    public List<Book> getAllBooksByGenre(){

        List<Book> booksOrderedByGenre= new ArrayList<>(bookSet);
        booksOrderedByGenre.sort(new GenreComparator());
        return booksOrderedByGenre;
    }

    //getBooksByGenre()
    public Set<Book> getBooksByGenre(Genre genre) throws Exception{
        Set<Book> allBooksByGenre = new HashSet<>();
        int count =-1;
        for(Book book : bookSet ){
            if(!book.getGenre().equals(genre)){
                count = 0;
            }
            else {
                allBooksByGenre.add(book);
                count =-1;
            }

        }
        if (count == 0) {
            throw new Exception("Genul nu exista ");
        }else{
            return allBooksByGenre;
        }

    }


    @Override
    public String toString() {
        return "BookStore{" +
                "bookSet=" + bookSet +
                '}';
    }
}
