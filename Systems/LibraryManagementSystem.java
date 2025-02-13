import java.util.Scanner;

class Library {
    private int count;
    private String[] books;
    private boolean[] isBorrowed;
    private final int MAX_SIZE = 10;

    public Library() {
        this.books = new String[MAX_SIZE];
        this.isBorrowed = new boolean[MAX_SIZE];
        this.count = 0;
    }

    public void addBook(String book) {
        if(count < MAX_SIZE) {
            books[count] = book;
            isBorrowed[count] = false;
            count++;
            System.out.println("Book added successfully !!");
        }
        else {
            System.out.println("Library already full now !!");
        }
        return;
    }
    public void borrowBook(String book) {
        for(int i =0; i < count;i++) {
            if(books[i].equalsIgnoreCase(book)) {
                isBorrowed[i] = true;
                while(i <= count) {
                    books[i] = books[i+1];
                }
                count--;
                System.out.println("Book borrowed successfully !!");
                return;
            }
        }

        System.out.println("Book is not in the library !!");
    }

    public void searchBook(String book) {
        for(int i = 0;i < count; i++) {
            if(books[i].equalsIgnoreCase(book)) {
                System.out.println("Search book already there in the library !!");
            }
        }
    }

    public void printMenu() {
        System.out.println("Simple Library Management System :");
        System.out.println("1.Add Book into the Library ");
        System.out.println("2.Borrowed book within Library ");
        System.out.println("3.Search Book ");
        System.out.println("4.Exit");
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library  library = new Library();
        boolean running =true;

        while(running) {
            library.printMenu();
        System.out.println("Enter Your choice :");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {
            case 1:
                System.out.println("Enter Your Book Name :");
                String addBook = scanner.nextLine();
                library.addBook(addBook);
            break;
            case 2:
                System.out.println("Enter Borrow Book Name :");
                String borrowBook = scanner.nextLine();
                library.borrowBook(borrowBook);
            break;
            case 3:
                System.out.println("Enter Search Book Name :");
                String searchBook = scanner.nextLine();
                library.searchBook(searchBook);
            break;
            case 4:
                System.out.println("You exit the system successfully !!");
                running = false;
            break;
            default:
                System.out.println("Invalid Input. Please Entered Correct process ");
        }

        }
        scanner.close();
    }
}
