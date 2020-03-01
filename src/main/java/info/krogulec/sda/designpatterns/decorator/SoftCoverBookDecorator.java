package info.krogulec.sda.designpatterns.decorator;

/**
 * @author krogulecp
 */
class SoftCoverBookDecorator extends BookDecorator {
    SoftCoverBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return super.describe() + " with soft cover";
    }
}
