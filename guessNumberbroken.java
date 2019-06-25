import java.util.Scanner;

public class guessNumber {
    public static void main (String args[]) {
        // setup
        int guess = 0;
        int target = 0;
        int
        
        Scanner input = new Scanner(System.in); // for getting input

        target = (int) Math.ceil(100.0 * Math.random());
        
        // loop, asking for new guess until the guess = target
        while (target  guess) {      // need a comarison operator
            System.out.println("Guess a number from 1 to 100");
            guess = input.nextInt();

            if (guess>target) { // if to high do ...
                System.out.println("Too High"); //this
            }
            // if too low ...



            // add one to tries
              
        }
        ("Correct");
        ("That took you " +  tries + " tries");
        input.close();
    }
}