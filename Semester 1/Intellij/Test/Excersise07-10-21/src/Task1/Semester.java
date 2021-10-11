package Task1;

import java.util.ArrayList;

public class Semester {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();

    public Semester(String name, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
