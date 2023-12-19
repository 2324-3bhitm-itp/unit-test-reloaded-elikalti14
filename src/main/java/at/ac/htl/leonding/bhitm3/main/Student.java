package at.ac.htl.leonding.bhitm3.main;

import java.util.Objects;

public class Student extends Person {
    private String studentID;
    private Teacher teacher;

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public Object getStudentID() {
        return this.studentID;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID);
    }

    

}
