import java.util.Arrays;

// write your class here
class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        Object[] original;
        this.authors = Arrays.copyOf(authors, authors.length);
    }
}
