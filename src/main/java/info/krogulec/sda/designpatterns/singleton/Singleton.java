package info.krogulec.sda.designpatterns.singleton;

/**
 * @author krogulecp
 */
class Singleton {

    private static Singleton instance = new Singleton();

    //prywatny konstruktor uniemożliwia stworzenie obiektu przez inne obiekty
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
