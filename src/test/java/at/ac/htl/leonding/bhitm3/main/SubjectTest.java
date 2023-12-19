package at.ac.htl.leonding.bhitm3.main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubjectTest {
    
    @Test
    public void test_if_th_subject_is_instance_of_Subject() {
        assertTrue(Subject.valueOf("MATHEMATICS") instanceof Subject);
        assertTrue(Subject.valueOf("ENGLISH") instanceof Subject);
        assertTrue(Subject.valueOf("GERMAN") instanceof Subject);
        assertTrue(Subject.valueOf("MEDT") instanceof Subject);
        assertTrue(Subject.valueOf("SEW") instanceof Subject);
        assertTrue(Subject.valueOf("CHEMISTRY") instanceof Subject);
        assertTrue(Subject.valueOf("PHYSICS") instanceof Subject);
        assertTrue(Subject.valueOf("SYT") instanceof Subject);
        assertTrue(Subject.valueOf("ITP") instanceof Subject);
    }

}
