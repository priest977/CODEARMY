package Java8;

import java.util.*;

// First way for sorting the Element
class Myclass implements java.util.Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b) {
        return b-a;
    }
}


// Third way make one class called Person and make 4 object and sort all the with the help of age

class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Comparator {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(6);
//        list.add(0);
//        list.add(4);
//        list.add(3);
//        list.add(9);
//        Collections.sort(list ,new Myclass());
//        System.out.println(list);

        // Second way for sorting the element by using comparator Interface withor creating the new class and without making the object
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(6);
//        list.add(0);
//        list.add(4);
//        list.add(3);
//        list.add(9);
//        Collections.sort(list ,(a,b)->b-a);
//        System.out.println(list);


        // Third way
        Person nafish = new Person(12,"nafish");
        Person rishabh = new Person(10,"rishabh");
        Person prashant = new Person(7,"prashant");
        List<Person> list = Arrays.asList(nafish,rishabh,prashant);
        Collections.sort(list , (a,b) -> b.age-a.age);
        System.out.println(list);
    }
}
