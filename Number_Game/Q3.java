
//3. Compare the user's guess with the generated number and provide feedback on whether the guess
//is correct, too high, or too low.
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Random guess = new Random();
        Scanner in = new Scanner(System.in);

        int randomNumber = guess.nextInt(100)+1;
        int userGuess =0;

        System.out.println("I had Generated some random number in between 1 to 100 ");
        System.out.println("Try to guess  it ");

        while(userGuess!=randomNumber){
            System.out.print("Enter your Guess  Number : ");
            userGuess=in.nextInt();


        
            if (userGuess > randomNumber){
                System.out.println("Your guess is " + userGuess +" Higher than  correct guess" );
            }
            else if (userGuess < randomNumber) {
                System.out.println(" Your guess is  " + userGuess +" Lower  than  correct guess " );
                
            }

        }

        System.out.println("Congratulations!! You Had Guess the Right Number : " + randomNumber );
        in.close();


    }
    
}
