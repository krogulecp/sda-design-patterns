package info.krogulec.sda.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {
        new World(new RandomEnemyFactory()).createWorld();
    }
}
