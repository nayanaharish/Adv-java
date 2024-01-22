package java8.fuctional.interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        //Area of Circle
        Function<Integer,Double> circle = (r)->3.14 * r * r ;
        System.out.println(circle.apply(2));
        //Area of a square
        Function<Integer,Double> square = (r)-> (double) (r * r);
        System.out.println(circle.apply(2));
        //Area of a rectangle
        BiFunction<Integer,Integer,Double> rectangle = (r, l)-> (double) (r * l );


    }
}
