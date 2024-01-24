package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Design the ArrayList

        //1. Declared the Arraylist
    //    ArrayList<Integer> l1 = new ArrayList<>();

        //2. Add Any Element in Array List So we will use the method add
//        l1.add(1); // 1
//        l1.add(2); // 1 2
//        l1.add(3); // 1 2 3
//        l1.add(4); // 1 2 3 4
//        l1.add(5); // 1 2 3 4 5
//        l1.add(6); // 1 2 3 4 5 6

        // get the size of the Array List by using size method
//        System.out.println(l1.size());

        //3. Print the ArrayList by using loop
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }

        //4. Print the ArrayList Directly by without using loop
//        System.out.println(l1);

        //5. Get any element by using index
        //   System.out.println(l1.get(3));

        //6. Adding Element at some index i
//        l1.add(1,100);
//        System.out.println(l1);

        //7. Modify Element at index i
//        l1.set(1,110);
//        System.out.println(l1);

        //8. Removing at element at index i
//        l1.remove(1);
//        System.out.println(l1);

        //9. Removing an Element in the ArrayList
//        l1.remove(Integer.valueOf(2)); // It will remove the element 2
//        System.out.println(l1);

        //10. Checking if Element Exist
//        boolean ans = l1.contains(Integer.valueOf(78));
//        System.out.println(ans);

        //11. If you don't Specify Class you can put any data type inside l
//        ArrayList l = new ArrayList();
//        l.add("Nafish"); // here is String
//        l.add(10);  // Here int
//        l.add(true); // here boolean
//        System.out.println(l);


        //*******************************************Question*****************************
        //*******************************For Integer**************************************
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(56);
//        list.add(3);
//        list.add(92);
//        list.add(5);
//        System.out.println("Original ArrayList : " + list);
//        Collections.reverse(list); //1. Another way to Revrse any ArrayList By Using Collections class
//        // Inside the class we are using reverse method by using the ArrayList
//        System.out.println("Reverse ArrayList : " + list);
//
//        // 2. Second Method  we are using for Sort the ArrayList
//        Collections.sort(list); // But Sort Method only use for Sort the data type in Ascending order only
//        System.out.println("Ascending Order : " + list);
//
//        // 3. If you want to sort the data type in Descending order so we are using
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println("Descending Order : " + list);

//        reverseArrayList(list); // That Method we are writing for reverse the ArrayList
//        System.out.println("Reverse ArrayList : " + list);

     //****************************For String************************************
     // We are using the same Method for String as well
     // Note important == > In String Reverse and Sort are Basically work in the Form of (Lexicographically)
        // So it will reverse or sort the String with the help of Ascaii value of String.
//     ArrayList<String> str = new ArrayList<>();
//     str.add("My");
//     str.add("Name");
//     str.add("Is");
//     str.add("Nafish");
//     System.out.println("Original String" + str);
//     Collections.reverse(str);
//     System.out.println("Reverse String " + str);
//     // And all Other Method we are using for String as well like Sort , reverse etc


        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(4);
        list.add(0);
        list.add(5);
        list.add(-27);
        list.add(9);
        list.add(0);
        pushZerosAtEnd(list);
        System.out.println(list);


    }

    //1. Reverse The Number by using ArrayList
    public static void reverseArrayList(ArrayList<Integer> list){
        int i = 0;
        int j = list.size()-1;
        while (i<j){
            swap(list , i , j);
            i++;
            j--;
        }
    }



    // Swap the Number by using ArrayList
    public static void swap(ArrayList<Integer> list , int i , int j){
        Integer temp = list.get((i));
        list.set(i,list.get(j));
        list.set(j,temp);
    }

    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        // Write your code here.
        int i = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j) != 0) {
                swap(arr, i, j);
                i++;
            }
        }
    }

}
