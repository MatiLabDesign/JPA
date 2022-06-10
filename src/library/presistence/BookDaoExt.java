package library.presistence;

import library.entity.Book;

public class BookDaoExt extends DAO<Book> {

    @Override
    public void save(Book book) {
        super.save(book);

    }

    public Book searchByIsbn(Long isbn) {

        conect();
        Book book = (Book) em.createQuery("SELECT l FROM Book l WHERE l.isbn like :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        disconect();
        return book;

    }

    public Book searchById(Long id) {
        conect();
        Book book = em.find(Book.class, id);
        disconect();
        return book;
    }

}
