package demo.Serilaizable;

import java.io.*;

public class SerializableMain {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Nitin", 23, "A");
        Address a1 = new Address("Himachal", "India");
        s1.setStudentAddress(a1);
        System.out.println(s1.toString());
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("swap1"))){
            os.writeObject(s1);
        }catch(IOException exception) {
            System.out.println("Some error occurred" + exception.getLocalizedMessage());
            throw new Exception(exception);
        }
        System.out.println("Writing of the data to the file is complete");
        s1 = null;//clearing any reference
        //Trying to read the object from the swap file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("swap1"))){
            s1 = (Student) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while reading data from stream");
        }
        if(s1!=null){
            System.out.println("s1.toString() = " + s1.toString());
        }

    }
}
