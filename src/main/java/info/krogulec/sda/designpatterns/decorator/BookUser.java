package info.krogulec.sda.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krogulecp
 */
class BookUser {

    public static void main(String[] args) {
        Book book = new BasicBook();

        Book fictionBookDecorator = new FictionBookDecorator(book);
        Book hardCoverBookDecorator = new HardCoverBookDecorator(book);
        Book scienceBookDecorator = new ScienceBookDecorator(book);
        Book scienceHardCoveredBook = new HardCoverBookDecorator(scienceBookDecorator);

        List<Book> books = new ArrayList<>();
        books.add(fictionBookDecorator);
        books.add(hardCoverBookDecorator);
        books.add(scienceBookDecorator);
        books.add(scienceHardCoveredBook);

        books.forEach(b -> System.out.println(b.describe()));


    }
}
