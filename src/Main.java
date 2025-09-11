import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // I main-metoden - ENDAST dessa listor för att spara tid
        // Böcker (index motsvarar varandra)
        ArrayList<String> bookTitles = new ArrayList<>();
        ArrayList<String> bookAuthors = new ArrayList<>();
        ArrayList<String> bookISBN = new ArrayList<>();
        ArrayList<Boolean> bookAvailable = new ArrayList<>(); // true =

        // Lån (index motsvarar varandra)
        ArrayList<String> borrowerNames = new ArrayList<>();
        ArrayList<String> borrowedBooks = new ArrayList<>(); // ISBN för lånad bok

        // Användare (index motsvarar varandra) Förinställd testdata (Person 5 skapar detta) Enkel huvudmeny (Person 5)
        ArrayList<String> userNames = new ArrayList<>();
        ArrayList<String> phoneNumbers = new ArrayList<>();

    }

    public static void addBook(ArrayList<String> titles,
                               ArrayList<String> authors, ArrayList<String> isbn, String
                                       title, String author, String isbnNumber) {
        titles.add(title);
        authors.add(author);
        isbn.add(isbnNumber);

        System.out.println("Book added: " + title + "by " + author + "ISBN Number: " + isbnNumber);
    }

    public static void displayAllBooks(ArrayList<String> titles,
                                       ArrayList<String> authors, ArrayList<String> isbn) {

        if(titles.isEmpty()){
            System.out.println("No book available.");
        }

        for(int i = 0; i<= titles.size(); i++){
            System.out.println(titles.get(i) +  "by " + authors.get(i) + "ISBN Number: " + isbn.get(i));
        }
    }

    public static int searchBook(ArrayList<String> titles,
                                 ArrayList<String> authors, String searchTerm) {

        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).toLowerCase().contains(searchTerm.toLowerCase()) ||
                    authors.get(i).toLowerCase().contains(searchTerm.toLowerCase())) {
                return i;
            }
        }
        return -1;

    }
}