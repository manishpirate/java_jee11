package demo.Arrays;

import java.util.Arrays;

public class Loader {


    public static void main(String[] args) {
        String[] names = new String[4];
        names[0]="Hey";
        names[1]="Hello";
        names[2]="world";
        names[3]="Bye";

        int index = Arrays.binarySearch(names,"world");
        System.out.println("Index of search is " + index);

        int [] namesInt = new int[]{1, 2, 3, 4};
        int [] namesInt2 ;
        namesInt2 = new int[]{1, 2, 3,4,5,6,7,8,9,9,0};
        System.out.println("Length before modification " + namesInt2.length);
        System.out.println("Length before modification " + namesInt2.length);
        for(int value : namesInt2){
            System.out.println("value = " + value);
        }
        System.out.println(Arrays.compare(namesInt, namesInt2));
        namesInt2 = Arrays.copyOf(namesInt2, 6);

        System.out.println("Length after modification " + namesInt2.length);
        for(int value : namesInt2){
            System.out.println("value = " + value);
        }

       /* namesInt2 = Arrays.copyOfRange(namesInt2, 7, 35);
        System.out.println("Length after copy of Range Method " + namesInt2.length);
        for(int value : namesInt2){
            System.out.println("value = " + value);
        }*/
        //Checking array.mistach

        String arr1[] ={"London","Pairs","New York"};
        String arr2[] = {"London","Pairs","New York","New York"};

        int x = Arrays.mismatch(arr1, arr2);
        System.out.println(x);
    }
}
