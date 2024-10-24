//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(17);
        MyInteger num2 = new MyInteger(28);

        System.out.println("num1: " + num1.getValue());
        System.out.println("num2: " + num2.getValue());
        
        System.out.println("num1 is even? " + num1.isEven());
        System.out.println("num2 is even? " + num2.isEven());

        System.out.println("num1 is odd? " + num1.isOdd());
        System.out.println("num2 is odd? " + num2.isOdd());

        System.out.println("num1 is prime? " + num1.isPrime());
        System.out.println("num2 is prime? " + num2.isPrime());

        System.out.println("Is 19 even? " + MyInteger.isEven(19));
        System.out.println("Is 20 odd? " + MyInteger.isOdd(20));
        System.out.println("Is 17 prime? " + MyInteger.isPrime(17));

        System.out.println("Is num1 even? " + MyInteger.isEven(num1));
        System.out.println("Is num2 prime? " + MyInteger.isPrime(num2));

        System.out.println("num1 equals 17? " + num1.equals(17));
        System.out.println("num1 equals num2? " + num1.equals(num2));
    }
}