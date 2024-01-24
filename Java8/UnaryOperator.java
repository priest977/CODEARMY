package Java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class UnaryOperator {
    public static void main(String[] args) {
//        Function<Integer , Integer> function = x -> x * x;
//        System.out.println(function.apply(4));
//
//        java.util.function.UnaryOperator<Integer> unaryOperator = x -> x * x;
//        System.out.println(unaryOperator.apply(4));

        BiFunction<String , String , String> biFunction = (str1 , str2) -> str1 + str2;
        System.out.println(biFunction.apply("Hi" , "Hello"));

        BinaryOperator<String> binaryOperator = (str1 , str2) -> str1+str2;
        System.out.println(binaryOperator.apply("Hi", "Nafish"));
    }
}
