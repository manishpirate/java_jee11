package demo.Generics;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Covariants {

    public static void printAnimalNames(List<? extends Animal> animalList){
       Animal animal = animalList.get(0);
        System.out.println(animal.getName());
    }

    public static void foo(Compartor<? super Cat> catCompartor){
        Cat c1 = new Cat("Coco", "23");
        Cat c2 = new Cat("Lucy", "34");

        System.out.println(catCompartor.isGreaterThan(c1,c2));

    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Tommy"));
        animalList.add(new Animal("Bruno"));

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Coco", "23"));
        catList.add(new Cat("Sheena", "34"));
        printAnimalNames(animalList);

        //we should now pass cat list to the print name method : Compiler warning is shown
        printAnimalNames(catList);
        foo( new CatCompare());
        foo(new AnimalCompare());
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {

    String catAge;

    public Cat(String name, String catAge) {
        super(name);
        this.catAge = catAge;
    }

    public String getCatAge() {
        return catAge;
    }

    public void setCatAge(String catAge) {
        this.catAge = catAge;
    }
}

class Dod extends Animal {

    String breed;

    public Dod(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class CatCompare implements Compartor<Cat> {

    @Override
    public boolean isGreaterThan(Cat t1, Cat t2) {
        return t1.getName().length()>t2.getName().length();
    }
}

class AnimalCompare implements Compartor<Animal> {

    @Override
    public boolean isGreaterThan(Animal t1, Animal t2) {
        return t1.getName().length()>t2.getName().length();
    }
}

