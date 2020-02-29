package info.krogulec.sda.designpatterns.factorymethod;

/**
 * @author krogulecp
 */
class Zombie extends Enemy {
    private static final String NAME = "Zombie";
    private static final int POWER = 67;
    public Zombie() {
        super(NAME, POWER);
    }
}
