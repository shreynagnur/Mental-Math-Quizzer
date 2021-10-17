import java.util.Scanner; //https://repl.it/repls/DisguisedEnergeticSupport
import java.util.Random;
class MentalMath {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    System.out.println("Type E for easy, M for medium, or H for hard");
    String difficulty = scan.next();
    System.out.println("How many questions?");
    int questionCount = scan.nextInt();
    int percentageRange = 0;
    int percentageInterval = 0;
    double d = 0;
    double q = 0;
    if (difficulty.equals("E") || difficulty.equals("e")) {
      percentageRange = 9;
      percentageInterval = 10;
    } else if (difficulty.equals("M") || difficulty.equals("m")) {
      percentageRange = 19;
      percentageInterval = 5;
    } else if (difficulty.equals("H") || difficulty.equals("h")) {
      percentageRange = 99;
      percentageInterval = 1;
    }
    int counter = 0;
    int percentage = 0;
    int base = 0;
    int score = 0;
    int root;
    long start = System.currentTimeMillis();
    for (int i = 0; i < questionCount; i++) {
      if (Math.random() > 0.5) {
        counter++;
        percentage = percentageInterval * ((int)(Math.random()*percentageRange)+1);
        base = 10 * ((int)(Math.random()*9)+1);
        System.out.println("What is " + percentage + "% of " + base + "?");
        double answer = scan.nextDouble();
        double precisePercentage = (double)percentage;
        if(Math.abs((answer - ((precisePercentage / 100) * base))) <= 0.01) {
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
    float time = (end-start) / (1000F);
    System.out.println("Time elapsed: " + time + " seconds");
    System.out.println("Score: " + score + "/" + questionCount);
    int otherCounter = questionCount - counter;
    System.out.println("You had " + counter + " division problems and " + otherCounter + " square root problems");
  }
}
