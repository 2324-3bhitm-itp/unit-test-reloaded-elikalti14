package at.ac.htl.leonding.bhitm3.main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CardTest {
    Card card;
    Subject subject;
    Teacher teacher;

    @Before
    public void setup() {
        card = new Card();
        subject = Subject.MATHEMATICS;
        teacher = new Teacher();
    }
    
    @Test
    public void testCardAttributes() {
        card.setId(1);

        teacher.setName("Martin");
        teacher.setSubject(subject);

        card.setSubject(subject);
        card.setTeacher(teacher);

        assertEquals(1, card.getId());
        assertEquals(subject, card.getSubject());
        assertEquals(teacher, card.getTeacher());
    }
}
