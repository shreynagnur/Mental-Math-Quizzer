import java.util.Scanner; //https://repl.it/repls/DisguisedEnergeticSupport
import java.util.Random;
class MentalMath {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    System.out.println("Type E for easy, M for medium, or H for hard");
    String a = scan.next();
    System.out.println("How many questions?");
    int k = scan.nextInt();
    int z = 0;
    int w = 0;
    double d = 0;
    double q = 0;
    if (a.equals("E") || a.equals("e")) {
      z = 9;
      w = 10;
    } else if (a.equals("M") || a.equals("m")) {
      z = 19;
      w = 5;
    } else if (a.equals("H") || a.equals("h")) {
      z = 99;
      w = 1;
    }
    int counter = 0;
    int x = 0;
    int y = 0;
    int score = 0;
    int root;
    long start = System.currentTimeMillis();
    for (int i = 0; i < k; i++) {
      if (Math.random() > 0.5) {
        counter++;
        x = w*((int)(Math.random()*z)+1);
        y = 10*((int)(Math.random()*9)+1);
        System.out.println("What is " + x + "% of " + y + "?");
        d = scan.nextDouble();
        q = (double)x;
        if(Math.abs((d - ((q/100)*y))) <= 0.01) {
          System.out.println("Correct!");
          score++;
        } else {
          System.out.println("Incorrect :(");
        }
      } else {
        root = rand.nextInt(1001);
        System.out.println("Square root of " + root + " to the nearest integer?");
        if (scan.nextInt() == Math.round(Math.sqrt(root))) {
          System.out.println("Correct!");
          score++;
        } else {
          System.out.println("Incorrect :(");
        }
      }
    }
    long end = System.currentTimeMillis();
    float time = (end-start)/(1000F);
    System.out.println("Time elapsed: " + time + " seconds");
    System.out.println("Score: " + score + "/" + k);
    int otherCounter = k - counter;
    System.out.println("You had " + counter + " division problems and " + otherCounter + " square root problems");
  }
}