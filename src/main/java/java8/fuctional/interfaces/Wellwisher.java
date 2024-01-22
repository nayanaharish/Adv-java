package java8.fuctional.interfaces;

public class Wellwisher {

    public static void main(String[] args) {

//        Greeting frenchGreeting = new Greeting() {
//            @Override
//            public void greet() {
//
//            }
//        };


        Greeting frenchGreeting = ()->{
            return "French greeting";
        };

        System.out.println(frenchGreeting.greet());

    }
}
