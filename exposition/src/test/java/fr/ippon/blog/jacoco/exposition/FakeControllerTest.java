package fr.ippon.blog.jacoco.exposition;

import static org.junit.Assert.*;

import fr.ippon.blog.jacoco.domain.Person;
import org.junit.Test;

public class FakeControllerTest {

    @Test
    public void shouldReturnMyToto() {
        // Prepare
        final FakeController fakeController = new FakeController();

        // Test
        final Person person = fakeController.exposeMyDomainClass();

        // Assert
        assertEquals(person.getName(), "a name from controller");
    }

}