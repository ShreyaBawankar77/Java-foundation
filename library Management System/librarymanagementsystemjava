import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        // Adding books
        books.add(new Book("Java Programming", "James Gosling"));
        books.add(new Book("Operating Systems", "Galvin"));
        books.add(new Book("Data Structures", "Seymour Lipschutz"));

        // 🔍 Searching book
        String searchTitle = "Java Programming";
        System.out.println("Searching for: " + searchTitle);

        boolean found = false;
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book Found:");
                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }

        // ❌ Removing book
        String removeTitle = "Data Structures";

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equalsIgnoreCase(removeTitle)) {
                books.remove(i);
                break;
            }
        }

        // 📚 Display after removal
        System.out.println("\nBooks after removal:");
        for (Book b : books) {
            b.display();
        }
    }
}
