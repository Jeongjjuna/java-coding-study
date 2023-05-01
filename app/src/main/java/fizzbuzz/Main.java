package fizzbuzz;
import java.util.Scanner;  // Import the Scanner class


interface FizzBuzz {
  void print(int from, int to);
}


class ConsoleBasedFizzBuzz implements FizzBuzz {

  @Override
  public void print(int from, int to) {

    for (int i = from; i <= to; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
    
    int from = 1, to = sc.nextInt();
    
    fizzBuzz.print(from, to);

    sc.close();
  }
  
}
