package info.krogulec.sda.designpatterns.decorator;

/**
 * @author krogulecp
 */
class BasicBook implements Book {
    @Override
    public String describe() {
        return "Book";
    }
}
