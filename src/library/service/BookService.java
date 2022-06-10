package library.service;

import library.entity.Author;
import library.entity.Book;
import library.entity.Publisher;
import library.presistence.BookDaoExt;
import static library.util.Orchestrator.read;

public class BookService {

    private final BookDaoExt DAO;
    private PublisherService publisherService;

    private final Author author = new Author();
    private final Publisher publisher = new Publisher();

    public BookService() {
        this.DAO = new BookDaoExt();
    }

    public Book createBook() {

        Book book = new Book();
        try {
            System.out.println("Insert ISBN ");
            book.setIsbn(read.nextLong());
            System.out.println("Insert Title ");
            book.setTitle(read.next());
            System.out.println("Insert Year ");
            book.setPyear(read.nextInt());
            System.out.println("Insert Units ");
            book.setUnits(read.nextInt());
            book.setAuthor(author);
            book.setPublisher(publisher);
            book.setCharge(Boolean.TRUE);
            DAO.save(book);

            return book;
        } catch (Exception e) {
            System.out.println("Fail creatring the book ");
            System.out.println(e.toString());
            return null;
        }

    }

}
