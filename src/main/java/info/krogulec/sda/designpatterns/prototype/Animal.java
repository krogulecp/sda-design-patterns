package info.krogulec.sda.designpatterns.prototype;

/**
 * @author krogulecp
 */
//Test musi stworzyć dwa obiekty typu Animal (jeden poprzez klonowanie) i sprawdzić, czy imię jest takie samo oraz czy referencje są różne
interface Animal {
    String getName();
    Animal cloneAnimal();
}
