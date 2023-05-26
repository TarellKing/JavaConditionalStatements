import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // how to create fizz - buzz in java. if # div by 5 print fizz if # div by 3 print buzz and if both
        // print FizzBuzz!

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");

        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0 ){
            System.out.print("FizzBuzz!"); }

        else if (number % 5 == 0 ){
            System.out.print("Fizz"); }

        else if (number % 3 == 0){
            System.out.print("Buzz"); }
        else System.out.println( number + " Is not div by 5 nor 3.");



    }
}
