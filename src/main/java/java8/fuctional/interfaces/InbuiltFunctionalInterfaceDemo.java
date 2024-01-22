package java8.fuctional.interfaces;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class InbuiltFunctionalInterfaceDemo {
    public static void main(String[] args) {

        Predicate<String> predicate = (num) -> num.length() > 8 ;

        System.out.println(predicate.test("Nayana "));

        Predicate<Integer> predicate1 = num -> num % 2== 0 ;
        System.out.println(predicate1.test(34));

        BiPredicate<String,Integer> biPredicate = (a,b) -> a.length() == b ;
        System.out.println(biPredicate.test("Nayana", 6));
        Consumer<String> consumer = (myString)-> System.out.println(myString.toLowerCase());
        consumer.accept("NAYANA");

        Predicate <String> predicate2 = (a)->a.equals(new StringBuilder(a).reverse().toString());
        System.out.println(predicate2.test("malayalam")+"is Pal");

        Consumer<Integer> consumer1 = (a)-> System.out.println(a+a);
        consumer1.accept(100);
    }
}
