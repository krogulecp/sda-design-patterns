package info.krogulec.sda.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krogulecp
 */
class SingletonTest {

    //przykład ze strukturą given, when, then
    @Test
    void should_be_the_same_instance_with_structure(){
        //given
        Singleton instance1 = Singleton.getInstance();

        //when
        Singleton instance2 = Singleton.getInstance();

        //then
        assertEquals(instance1, instance2);
    }

    //przykład jednolinijkowy
    //możemy utworzyć zmienną z zaznaczenia poprzez Ctrl+Alt+V
    @Test
    void should_be_the_same_instance(){
        assertEquals(Singleton.getInstance(), Singleton.getInstance());
    }

    //przykłąd z assertj
    @Test
    void should_be_the_same_instance_assertj(){
        assertThat(Singleton.getInstance()).isEqualTo(Singleton.getInstance());
    }
}