package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Implimentation {
    public static void main(String[] args) {
          hasMap();
    }

    public static void hasMap(){
        //1.Syntex
        //Map is the Interface which contain the hashmap Class
//        Map<String , Integer> map1 = new HashMap<>();

        // Or directly you can write class name both are working same
        HashMap<String , Integer> map = new HashMap<>();

        //2.Adding Element
        //HashMap is take key and than value
        map.put("Nafish" , 21);
        System.out.println(map + " ");
        map.put("Rishabh" , 22);
        map.put("Alim" , 23);
        System.out.println(map + " ");

        //3. Getting the value
        System.out.println(map.get("Nafish")); // 21
        System.out.println(map.get("Madan")); // null

        //4. Insertion and  Updating the value
        map.put("Nafish" , 34);
        System.out.println(map + " ");

        //5. Removing the pair from HashMap
        System.out.println(map.remove("Nafish")); // 34
        System.out.println(map.remove("Akash"));  // null

        //6.Contains if the Key in the hashmap
        System.out.println(map.containsKey("Alim")); // true
        System.out.println(map.containsKey("Nafish")); // false

        //7. Adding a new entry only if the key doesn't exist already
        // first way
        if(!map.containsKey("Nafish")) map.put("nafish" , 43);

        // Second way
        map.putIfAbsent("Nafish" , 67);

        //8. Get all the key in the hashmap
        System.out.println(map.keySet());

        //9. get all the value in hashmap
        System.out.println(map.values());

        //10. get all the entry in hashmap
        System.out.println(map.entrySet());

        // 11. Travrese all the entry for hashmap
        // a. first method if you want only key here we are using for each loop
        for(String key : map.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();

        // b. Second method if you want to print key as well as value
//        for(Map.Entry<String , Integer> ans : map.entrySet()){
//            System.out.printf("%s and %d\n" + ans.getKey() , ans.getValue());
//        }

       // c. we don't need to write the data type as well it is version of java 10 feature
       // simply write var and variable name and than keySet or KeyValue according to your requirement
       // that is also for each method but in java 10 plus version feature
        for(var e : map.keySet()){
            System.out.println(e + " ");
        }
    }
}
