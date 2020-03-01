package info.krogulec.sda.designpatterns.decorator;

/**
 * @author krogulecp
 */
class FictionBookDecorator extends BookDecorator {
    FictionBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return "Fiction " + super.describe();
    }
}
