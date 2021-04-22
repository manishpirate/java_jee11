package demo.annotations;


import demo.test.Test;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@TestAnnotation(name="Vande Matram")
public class DemoTestClass {


    private int s;


    public static void main(String[] args) {
        System.out.println("Hello Annotation");
        DemoTestClass d1 = new DemoTestClass();
        Annotation[] annotations = DemoSubclassAnnotation.class.getAnnotationsByType(TestAnnotation.class);
        TestAnnotation annotation1;
        for(Annotation annotation : annotations){
            annotation1 = (TestAnnotation) annotation;
            System.out.println(annotation1.name());
        }
    }
}
