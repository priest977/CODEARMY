package HashSet;

import java.util.*;

public class BasicImplimentation {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Nafish");
        hashSet.add("Rishabh");
        hashSet.add("Aalim");
//        hashSet.add("Nafish");
        System.out.println("Before Removal : " + hashSet); // [Aalim, Rishabh, Nafish]
        // Because HashSet do not contain dublicate element

        System.out.println(hashSet.contains("Nafish")); // true
        System.out.println(hashSet.size()); // 3

        hashSet.remove("Aalim");
        System.out.println("After Removal : " +hashSet);

        System.out.println(hashSet.contains("Aalim")); // false
        System.out.println(hashSet.size()); // 2

        // Traversal
//        for(var ans : hashSet){
//            System.out.println(ans + " ");
//        }

        // OR

        for(String ans : hashSet){
            System.out.println(ans + " ");
        }

    }
}
