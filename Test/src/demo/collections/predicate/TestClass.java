package demo.collections.predicate;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Student s1 = new Student(23, "Nitin", "B.Tech");
        Student s2 = new Student(22,"Pranav", "MBA");
        Student s3 = new Student(21, "Prince", "Filography");

        List<Student> cseStudentList = new ArrayList<>();
        cseStudentList.add(s1);
        cseStudentList.add(s2);
        cseStudentList.add(s3);

        System.out.println("-------List before modification-------");
        for(Student student : cseStudentList){
            System.out.println(student.getName() + " is " + student.getAge() +  " years old and studying for " + student.getCourseName());
        }

        cseStudentList.removeIf(new AgePredicate().negate());

        System.out.println("-------List after modification-------");
        for(Student student : cseStudentList){
            System.out.println(student.getName() + " is " + student.getAge() +  " years old and studying for " + student.getCourseName());
        }

    }
}
