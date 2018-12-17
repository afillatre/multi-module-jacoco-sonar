package fr.ippon.blog.jacoco.exposition;

import fr.ippon.blog.jacoco.domain.Person;

public class FakeController {

    public Person exposeMyDomainClass() {
        final Person person = new Person();
        person.setName("a name from controller");
        return person;
    }

}
