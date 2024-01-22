package java8.fuctional.interfaces;

import java.util.Scanner;

public class ClassTask {

    public static void main(String[] args) {
        Test test = ()-> System.out.println("Testing..");
        Mobile mobile = ()-> { return "calling"; };
        Vehicle vehicle = ()-> System.out.println("vehicle is running..");

        Computer computer = ()->  "Surfing...";
        System.out.println(computer.surfInternet());

        Greetings greeting = (String greet) -> {return greet ;};
        Calculator add = (a,b)->  a + b;
        Calculator sub = (a,b) -> a - b ;
        Calculator div = (a,b) -> a  / b ;
        Calculator mul = (a,b) -> a *  b ;
        System.out.println(add.calculate(10, 10));
        System.out.println(sub.calculate(23,5));
        System.out.println(div.calculate(10, 10));
        System.out.println(mul.calculate(10, 10));

        CaseConversion lower = (input)-> input.toLowerCase();
        CaseConversion upper = (input)-> input.toUpperCase();
        CaseConversion removeSpace = (input) -> input.trim();
        CaseConversion replaceWithT = (input)-> input.replace((char) input.indexOf(0),'T');
        System.out.println(replaceWithT.convert("Nayana"));
        System.out.println("Nayana".indexOf(1));

        System.out.println("Enter the String:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Lower :"+lower.convert(input));
        System.out.println("Upper :"+upper.convert(input));

    }
}

interface CaseConversion
{
    String convert(String input);
}
interface Test{
    void testing();

}

interface Mobile{
    String call();

}

interface Vehicle
{
    void run();
}
interface Calculator
{
    double calculate(int a,int b);
}
interface Computer
{
    String surfInternet();
}

interface Greetings
{
    String greet(String greetingWord);
}