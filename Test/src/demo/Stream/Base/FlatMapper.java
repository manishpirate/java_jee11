package demo.Stream.Base;

import java.util.ArrayList;
import java.util.List;

public class FlatMapper {

    public static void main(String[] args) {
        //we will create 2 addresses in a list
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("India", "Punjab", "Sector-112"));
        addressList.add(new Address("India", "Goa", "Panji"));
        Student s1 = new Student("Manish", 23, addressList);
        System.out.println("--------1---------");
        addressList.stream().forEach(System.out::println);
        addressList = new ArrayList<>();
        addressList.add(new Address("India", "Delhi", "KalkaJi"));
        addressList.add(new Address("India", "Himachal Pradesh", "Shimla"));
        Student s2 = new Student("Nitin", 23, addressList);
        System.out.println("--------2---------");
        addressList.stream().forEach(System.out::println);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        //Now we will stream all the students and print all the address in it
        System.out.println("We will print the list of address here ");
        studentList.stream().flatMap( student -> student.getStudentList()).forEach(System.out::println);
    }

}
