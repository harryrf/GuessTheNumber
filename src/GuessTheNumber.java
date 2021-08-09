import java.util.Random;
import java.util.Scanner;

/*
 * @author Harry Fahringer III
 * 8 Aug 2021 
 */

 public class GuessTheNumber {

  int theNUMBER;
  int max;
  Scanner scanner = new Scanner(System.in);

  public GuessTheNumber () {
    Random rand = new Random();
    max = 100;
    theNUMBER = Math.abs(rand.nextInt() % max + 1);
  }

  public void play () {
    while (true) {  
      int move = scanner.nextInt();
      if (move > theNUMBER) {
        System.out.print("Try guessing a smaller number");
      } else if (move < theNUMBER) {
        System.out.println("Try guessing a larger number");
      } else {
        System.out.println("You guessed the correct number!");
        break;
      }
    }
  }

  public static void howBigIsMyNumber (int x) {
    if (x >= 0 && x <= 10) {
      System.out.println("Our number is between 0 and 10. (" + x + ")");
    } else if (x >= 11 && x <= 100) {
      System.out.println("Our number is between 11 and 100. (" + x + ")");
    } else {
      System.out.println("Our number is not between 0 and 100. (" + x + ")");
    }
  }

 public static void main(String [] args) {
  GuessTheNumber game = new GuessTheNumber();
  System.out.println("Guess a number between 0 and 100");
  game.play();
 }


}