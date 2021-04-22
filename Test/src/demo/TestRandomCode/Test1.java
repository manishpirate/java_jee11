package demo.TestRandomCode;

import java.util.Arrays;

public class Test1 {


    public static void main(String[] args) {
        int arrayString[]= {8, 2};
        Arrays.sort(arrayString);
        int x =  Arrays.binarySearch(arrayString, 2);
        System.out.println(x);
        

    }


}
