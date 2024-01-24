package Java8;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
//        Predicate<Integer> salaryGreaterThanOneLakh = x -> x>10000;
//        System.out.println(salaryGreaterThanOneLakh.test(100000));

        Predicate<String> compareFirstLetter = str -> str.toLowerCase().charAt(0) == 'n';
        System.out.println(compareFirstLetter.negate().test("Nafis"));
    }
}
