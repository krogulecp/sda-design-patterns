package info.krogulec.sda.designpatterns.adapter;

/**
 * @author krogulecp
 */
class ClassicRowingBoat implements RowingBoat {

    @Override
    public void row() {
        System.out.println("Classic rowing boat is sailing");
    }
}
