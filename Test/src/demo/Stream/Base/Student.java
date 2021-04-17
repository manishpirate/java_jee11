package demo.Stream.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Student {

    private String studentName;
    private int studentAge;
    private List<Address> addressList = new ArrayList<>();


    public Student(String studentName, int studentAge, List<Address> addressList) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.addressList = addressList;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    
    public Stream<Address> getStudentList(){
        return this.addressList.stream();
    }
}
