package at.ac.htl.leonding.bhitm3.main;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private int teacherId;
    private List<Card> cards = new LinkedList<Card>();
    private Subject subject;
    
    public void createCard(int id) {
        Card card = new Card();
        card.setId(id);
        card.setSubject(subject);
        card.setTeacher(this);
        cards.add(card);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setTeacherId(int id) {
        this.teacherId = id;
    }

    public int getTeacherId() {
        return this.teacherId;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return this.subject;
    }
}