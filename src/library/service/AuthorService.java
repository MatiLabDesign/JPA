package library.service;

import library.entity.Author;
import static library.util.Orchestrator.read;

public class AuthorService {

    public void sayHi() {
        System.out.println("HI Im an Author: ");
    }

    public Author createAuthor(String name) {
        Author author = new Author();
        author.getName();
        return author;

    }

    public void showAuthor(String author) {

        System.out.println(author);
    }

}
