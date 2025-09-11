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

    public static boolean borrowBook(
            ArrayList<Boolean> available,
            ArrayList<String> borrowers,
            ArrayList<String> borrowedBooks,
            int bookIndex,
            String borrowerName
    ) {
        return false;
    }

    public static boolean returnBook(ArrayList<Boolean> available, ArrayList<String> borrowers, ArrayList<String> borrowedBooks, String isbnNumber) {
        return false;
    }

    public static void displayBorrowedBooks(ArrayList<String> borrowers, ArrayList<String> borrowedBooks) {
        System.out.println("Test");
    }

    public static void registerUser(ArrayList<String> userNames,
                                    ArrayList<String> phoneNumbers, String name, String
                                            phoneNumber) {
        userNames.add(name);
        phoneNumbers.add(phoneNumber);
        System.out.println("User added: name " + name + " phone number " +
                phoneNumber);
    }

    public static void displayAllUsers(ArrayList<String> userNames,
                                       ArrayList<String> phoneNumbers) {
        System.out.println("Registered users are:");
        for (int i = 0; i < userNames.size(); i++) {
            System.out.println("User: " + i + " Name: " + userNames.get(i) + " phone number: " +
                    phoneNumbers.get(i));
        }
    }

    public static int searchUser(ArrayList<String> userNames, String
            name) {
        int result = -1;

        for (int i = 0; i < userNames.size(); i++) {
            if (userNames.get(i).equals(name)) {
                result = i;
            }
        }
        return result;
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