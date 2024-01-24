package Java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiTypeInterface {
    public static void main(String[] args) {
//        BiPredicate<Integer , Integer> biPredicate = (a,b)->a%2==0 && b %2==0;
//        System.out.println(biPredicate.test(2,4));

//        BiFunction<String , String , Integer> biFunction = (str1,str2) -> str1.length()+str2.length();
//        System.out.println(biFunction.apply("Hi" , "Hello"));

        Consumer<Integer> consumer = (x) ->{
            System.out.println(x);
        };
        consumer.accept(4);

        BiConsumer<Integer , Integer> biConsumer = (a ,b) -> {
            System.out.println(a +b);
        };
        biConsumer.accept(2,3);
    }
}
