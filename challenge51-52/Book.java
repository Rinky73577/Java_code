public class Book {

    static int totalNoOfBooks;

    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++; // object init
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "unknown", "unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the Book");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("hope you enjoyed, please leave a review");
        } else {
            System.out.println("this book is already returned");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}