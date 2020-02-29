package info.krogulec.sda.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krogulecp
 */
class NotSingletonTest {

    @Test
    void should_not_be_the_same_instance_with_structure(){
        assertNotEquals(NotSingleton.getInstance(), NotSingleton.getInstance());
    }
}