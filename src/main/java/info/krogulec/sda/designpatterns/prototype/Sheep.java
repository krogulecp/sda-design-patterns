package info.krogulec.sda.designpatterns.prototype;

/**
 * @author krogulecp
 */
class Sheep implements Animal {

    private final String name;

    Sheep(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Animal cloneAnimal() {
        return new Sheep(name);
    }
}
