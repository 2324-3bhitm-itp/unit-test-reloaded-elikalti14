package at.ac.htl.leonding.bhitm3.main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    Person person;

    @Before
    public void setup() {
        person = new Person();
    }
    
    @Test
    public void given_person_when_name_is_John() {
        person.setName("John");
        assertEquals("John", person.getName());
    }
    @Test
    public void given_when_surname_is_Doe() {
        person.setSurname("Doe");
        assertEquals("Doe", person.getSurname());
    }
}