package library.util;

import java.util.Scanner;

import library.presistence.BookDaoExt;
import library.service.AuthorService;
import library.service.BookService;
import library.service.PublisherService;

public class Orchestrator {

    public static AuthorService as = new AuthorService();
    public static PublisherService ps = new PublisherService();
    public static BookService bs = new BookService();

    public static Scanner read = new Scanner(System.in);
    static boolean flag = true;
    static String salir;

    public static int toSelect() {

        int option = 0;
        do {

            System.out.println("----------------------------------------");
            System.out.println("Chose one option:");
            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println(" 1. Create book.\n "
                    + "2. Search book by ISBN.\n "
                    + "3. Search book by Title.\n "
                    + "4. Search book by Author.\n "
                    + "5. Search book by Publisher.\n "
                    + "6. Quit\n "
                    + " "
            );

            option = read.nextInt();

        } while (option < 1 || option > 9);

        return option;

    }

    public static void orchestratorMenu(int option) {

//        AuthorService as = new AuthorService();
//        PublisherService ps = new PublisherService();
//        BookService bs = new BookService();
        switch (option) {
            case 1:
                System.out.println("1");
               bs.createBook();
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:

                System.out.println("Do you want quit? y/n");
                salir = read.next().toLowerCase();

                if ("y".equals(salir)) {
                    System.out.println("Good bye. Thank you!");
                    flag = false;
                }
                break;
        }
    }

    public static void ochestratorMethod() {

        do {
            int selection = toSelect();
            orchestratorMenu(selection);
        } while (flag == true);
    }
}
