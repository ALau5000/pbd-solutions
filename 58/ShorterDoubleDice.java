import java.util.Random;

public class ShorterDoubleDice {
  public static void main(String[] args) {
    Random r = new Random();
    
    int roll1, roll2, rollTotal;
    System.out.println("Here come the dice!!!\n");
    
    do { 
      roll1 = 1 + r.nextInt(6);
      roll2 = 1 + r.nextInt(6);
      rollTotal = roll1 + roll2;
      System.out.println("Roll #1: " + roll1);
      System.out.println("Roll #2: " + roll2);
      System.out.println("Total: " + rollTotal);
    } while (roll1 != roll2);
  } 
}
