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

    public static int countAvailableBooks(ArrayList<Boolean> available)
    {
        int availableBooks = 0;

        for (Boolean availableBook : available)
        {
            if (availableBook)
            {
                availableBooks++;
            }
        }

        return availableBooks;
    }

    public static int countBorrowedBooks(ArrayList<Boolean> available)
    {
        int borrowedBooks = 0;

        for (Boolean availableBook : available)
        {
            if (!availableBook)
            {
                borrowedBooks++;
            }
        }

        return borrowedBooks;
    }

    public static void displayLibraryStatistics(ArrayList<String> titles, ArrayList<Boolean> available, ArrayList<String> userNames)
    {
        System.out.println("Library statistics:\n");

        System.out.println("Total number of books: " + titles.size());
        System.out.println("Available books: " + countAvailableBooks(available));
        System.out.println("Borrowed books: " + countBorrowedBooks(available));

        // displayAllUsers
    }
}