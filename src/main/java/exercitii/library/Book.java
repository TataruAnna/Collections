package exercitii.library;



public class Book implements Comparable<Book>{
    private int year;
    private String title;
    private String author;
    private Genre genre;

    public Book(int year, String title, String author, Genre genre) {
        this.year = year;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(year,book.getYear());
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + genre +
                '}';
    }
}
