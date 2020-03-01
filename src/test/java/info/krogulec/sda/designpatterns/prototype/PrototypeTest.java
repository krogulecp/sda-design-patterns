package info.krogulec.sda.designpatterns.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krogulecp
 */
class PrototypeTest {

    @Test
    void should_clone_animal(){
        //given
        final String name = "Dolly";
        Animal sheep = new Sheep(name);

        //when
        Animal sheepClone = sheep.cloneAnimal();

        //then
        assertEquals(sheep.getName(), sheepClone.getName());
        assertNotEquals(sheep, sheepClone);
    }
}