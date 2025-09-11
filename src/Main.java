import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

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

        // Fördefinierade böcker
        bookTitles.add("Harry Potter");
        bookTitles.add("Sagan om ringen");
        bookTitles.add("1984");
        bookAuthors.add("J.K. Rowling");
        bookAuthors.add("Tolkien");
        bookAuthors.add("Orwell");
        bookISBN.add("111");
        bookISBN.add("222");
        bookISBN.add("333");
        bookAvailable.add(true);
        bookAvailable.add(true);
        bookAvailable.add(false); // 1984 är utlånad

        // Fördefinierade användare
        userNames.add("Anna");
        userNames.add("Erik");
        phoneNumbers.add("070-1234567");
        phoneNumbers.add("070-7654321");

        // Fördefinierat lån
        borrowerNames.add("Anna");
        borrowedBooks.add("333"); // Anna har lånat 1984

        while (true) {
            System.out.println("\n=== BIBLIOTEKSSYSTEM ===");
            System.out.println("1. Visa alla böcker");
            System.out.println("2. Lägg till bok");
            System.out.println("3. Låna bok");
            System.out.println("4. Återlämna bok");
            System.out.println("0. Avsluta");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Rensa newline
            switch (choice) {
                case 1:
                    //displayAllBooks(bookTitles, bookAuthors,
                    //        bookISBN);
                    break;
                case 2:
                    displayAddBook();
                    break;
                case 3:

                    displayBorrowBook(userNames, bookAvailable, borrowerNames, borrowedBooks);
                    break;

                case 4:
                    displayReturnBook(bookISBN, bookAvailable, borrowerNames, borrowedBooks);
                case 0:
                    return;
            }



        }
    }

    private static void displayReturnBook(ArrayList<String> bookISBN, ArrayList<Boolean> bookAvailable, ArrayList<String> borrowerNames, ArrayList<String> borrowedBooks) {
        System.out.print("Vilken bok vill du återlämna:");
        String bookName = scanner.nextLine();

        int bookIndex = 0;//searchBook
        String returnBookISBN = bookISBN.get(bookIndex);
        if(returnBook(bookAvailable, borrowerNames, borrowedBooks, returnBookISBN))
        {
            System.out.println("Booken är återlämnad.");
        }
        else
        {
            System.out.println("Något gick fel.");
        }
        return;
    }

    private static void displayBorrowBook(ArrayList<String> userNames, ArrayList<Boolean> bookAvailable, ArrayList<String> borrowerNames, ArrayList<String> borrowedBooks) {
        System.out.print("Vem är du?:");
        String borrowerName = scanner.nextLine();

        int userIndex = searchUser(userNames, borrowerName);
        if (userIndex == -1) {
            System.out.println("Du finns inte registrerad.");
            return;
        }

        System.out.print("Vilket bok vill du låna:");
        String bookName = scanner.nextLine();
        int bookIndex = 0; //searchBook

        if(borrowBook(bookAvailable, borrowerNames, borrowedBooks, bookIndex, borrowerName))
        {
            System.out.println("Boken har lånats.");
        }
        else
        {
            System.out.println("Något gick fel.");
        }
    }

    private static void displayAddBook() {
        System.out.print("Titel: ");
        String title = scanner.nextLine();
        System.out.print("Författare: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        //addBook(bookTitles, bookAuthors, bookISBN, title,
        //        author, isbn);
    }

    public static void displayMainMenu(){
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