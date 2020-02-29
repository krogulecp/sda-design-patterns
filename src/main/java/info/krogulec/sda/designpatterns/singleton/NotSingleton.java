package info.krogulec.sda.designpatterns.singleton;

/**
 * @author krogulecp
 */
class NotSingleton {

    private NotSingleton() {
    }

    public static NotSingleton getInstance(){
        return new NotSingleton();
    }
}
