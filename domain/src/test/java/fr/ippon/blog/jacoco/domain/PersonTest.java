package fr.ippon.blog.jacoco.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    @Test
    public void shouldGetWhatIsSet() {
        // Prepare
        final Person person = new Person();

        // Test
        person.setAge(18);

        // Assert
        assertEquals(person.getAge(), 18);
    }
}