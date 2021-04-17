package demo.collections.predicate;

import java.util.*;

public class TestClass2 {

    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        Student s1 = new Student(23, "Nitin", "B.Tech");
        Student s2 = new Student(22,"Pranav", "MBA");
        Student s3 = new Student(21, "Prince", "Filography");
        Student s4 = new Student(23, "Nitin", "B.Tech");

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        //studentSet.add(s4);

        System.out.println("-------Set Details -------");
        for(Student student : studentSet){
            System.out.println(student.getName() + " is " + student.getAge() +  " years old and studying for " + student.getCourseName());
        }

        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println("-------List Details -------");
        for(Student student : studentList){
            System.out.println(student.getName() + " is " + student.getAge() +  " years old and studying for " + student.getCourseName());
        }

        Collections.sort(studentList, new StudentComparator());

        System.out.println("-------List Details After Sorting -------");
        for(Student student : studentList){
            System.out.println(student.getName() + " is " + student.getAge() +  " years old and studying for " + student.getCourseName());
        }

        //Collections.sort(studentList, Collections.reverseOrder(new StudentComparator()));

        System.out.println("-------List Details After reverse Sorting -------");
        for(Student student : studentList){
            System.out.println(student.getName() + " is " + student.getAge() +  " years old and studying for " + student.getCourseName());
        }

        int index = Collections.binarySearch(studentList, s3, new StudentComparator(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }else  if(o1.getAge() < o2.getAge()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println("index = " + index);


    }
}
