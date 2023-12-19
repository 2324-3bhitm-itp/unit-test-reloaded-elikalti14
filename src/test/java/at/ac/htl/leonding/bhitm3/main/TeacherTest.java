package at.ac.htl.leonding.bhitm3.main;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TeacherTest {
    Teacher teacher;
    Subject subject;
    Card card;

    @Before 
    public void setup() {
        teacher = new Teacher();
        subject = Subject.MATHEMATICS;
        card = new Card();
    }

    @Test
    public void test_Teacher_attributes() {
        teacher.setTeacherId(1);

        teacher.setSubject(subject);

        assertEquals(1, teacher.getTeacherId());
        assertEquals(subject, teacher.getSubject());
    }

    @Test
    public void test_create_Card() {
        teacher.setTeacherId(1);

        teacher.setSubject(subject);

        teacher.createCard(1001);

        List<Card> cards = teacher.getCards();
        assertEquals(1, cards.size());
        assertEquals(1001, cards.get(0).getId());
        assertEquals(subject, cards.get(0).getSubject());
        assertEquals(teacher, cards.get(0).getTeacher());
    }

    @Test
    public void test_Add_and_Remove_Card() {
        teacher.setTeacherId(1);

        card.setId(1001);

        teacher.addCard(card);

        List<Card> cards = teacher.getCards();
        assertEquals(1, cards.size());

        teacher.removeCard(card);
        assertEquals(0, cards.size());
    }  
}