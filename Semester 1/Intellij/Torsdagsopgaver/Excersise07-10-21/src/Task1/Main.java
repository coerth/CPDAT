package Task1;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        School school = new School("CphBusiness", "Datamatiker");
        Address address1 = new Address("Dalgasvej", 9,"",4600,"Køge","Denmark");
        Address address2 = new Address("Nordens Plads", 8, "1TV", 2600, "KBH","Denmark");
        Teacher teacher1 = new Teacher("Jesper",32, address2);
        Student student1 = new Student("Casper", 26, address1);
        Student student2 = new Student("Mia", 30, address1);
        Student student3 = new Student("Long", 29, address1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Semester semester1 = new Semester("1. Semester", teacher1, students);
        System.out.println(school.getName()+" - "+school.getSemester()+ ":");
        System.out.println(semester1.getName()+" Studerende:");
        for(Student stud : students){
            System.out.println(stud);
            if(students.indexOf(stud) != students.size()-1){
                System.out.println();
            }

        }

    }
}
