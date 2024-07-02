package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Book;
import com.techlabs.model.BorrowService;
import com.techlabs.model.CatalogService;
import com.techlabs.model.EBook;
import com.techlabs.model.IBorrow;
import com.techlabs.model.ICatalog;
import com.techlabs.model.IReturn;
import com.techlabs.model.PrintedBook;
import com.techlabs.model.ReturnService;
import com.techlabs.model.User;
import com.techlabs.model.UserRegistrationService;

<<<<<<< HEAD
=======
<<<<<<< HEAD
public class LibraryManagementSystem {

    private static List<User> users = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
=======

>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c
public class LibraryManagementSystem {

    private static List<User> users = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();
<<<<<<< HEAD

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
=======
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
>>>>>>> 8cbd34df2c998d8a4757e67d516078a33fce72c1
>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c

        boolean exit = false;
        System.out.println("Welcome to Library Management System");
        while (!exit) {
            System.out.println("Choose");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Catalog Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
<<<<<<< HEAD
            System.out.println("6. Exit");
=======
<<<<<<< HEAD
            System.out.println("6. Exit");
=======
            System.out.println("6.Exit");
>>>>>>> 8cbd34df2c998d8a4757e67d516078a33fce72c1
>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    addUser(scanner);
                    break;
                case 3:
                    catalogBook(scanner);
                    break;
                case 4:
                    borrowBook(scanner);
                    break;
                case 5:
                    returnBook(scanner);
                    break;
                case 6:
                    exit = true;
<<<<<<< HEAD
                    System.out.println("Exiting... Thank you!");
=======
<<<<<<< HEAD
                    System.out.println("Exiting... Thank you!");
=======
>>>>>>> 8cbd34df2c998d8a4757e67d516078a33fce72c1
>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
<<<<<<< HEAD
    }

    private static void addBook(Scanner scanner) {
=======
<<<<<<< HEAD
    }

    private static void addBook(Scanner scanner) {
=======
	}
	
	private static void addBook(Scanner scanner) {
>>>>>>> 8cbd34df2c998d8a4757e67d516078a33fce72c1
>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c
        System.out.println("Enter Book Title");
        String title = scanner.next();

        System.out.println("Enter Book Author");
        String author = scanner.next();

        System.out.println("Choose Book Type");
        System.out.println("1. EBook");
        System.out.println("2. Printed Book");
        int chooseBookType = scanner.nextInt();
        Book book;
        switch (chooseBookType) {
            case 1:
                book = new EBook(title, author, false);
                System.out.println("EBook Added");
                break;
            case 2:
                book = new PrintedBook(title, author, false);
                System.out.println("Printed Book Added");
                break;
            default:
                System.out.println("Invalid option. Book not added.");
                return;
        }
        books.add(book);
    }

    private static void addUser(Scanner scanner) {
        System.out.println("Enter Username");
        String username = scanner.next();

        System.out.println("Enter UserID");
        int userId = scanner.nextInt();

        User user = new User(username, userId);
        users.add(user);
        UserRegistrationService userRegistration = new UserRegistrationService(user);
        userRegistration.registerUser();
    }

    private static void catalogBook(Scanner scanner) {
        System.out.println("Enter Book Title");
        String title = scanner.next();
        Book book = findBookByTitle(title);
        if (book != null) {
            ICatalog catalogService = new CatalogService();
            catalogService.catalogBook(book);
        } else {
            System.out.println("Book not found.");
        }
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 8cbd34df2c998d8a4757e67d516078a33fce72c1
>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c
    private static void borrowBook(Scanner scanner) {
        System.out.println("Enter User ID");
        int userId = scanner.nextInt();
        User user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Enter Book Title");
        String title = scanner.next();
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        IBorrow borrowService = new BorrowService();
        borrowService.borrowBook(user, book);
    }

    private static void returnBook(Scanner scanner) {
        System.out.println("Enter User ID");
        int userId = scanner.nextInt();
        User user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Enter Book Title");
        String title = scanner.next();
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isBorrowed()) {
            System.out.println("Book is not borrowed.");
            return;
        }

<<<<<<< HEAD
        IReturn returnService = new ReturnService();
=======
<<<<<<< HEAD
        IReturn returnService = new ReturnService();
=======
        IReturn returnService = new  ReturnService();
>>>>>>> 8cbd34df2c998d8a4757e67d516078a33fce72c1
>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c
        returnService.returnBook(user, book);
    }

    private static User findUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    private static Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======

}
>>>>>>> 8cbd34df2c998d8a4757e67d516078a33fce72c1
>>>>>>> 74d61a06d4efefa544eb895fe310e83ba186f52c
