package info.krogulec.sda.designpatterns.decorator;

/**
 * @author krogulecp
 */
abstract class BookDecorator implements Book{
    protected Book book;

    BookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String describe() {
        return book.describe();
    }
}
