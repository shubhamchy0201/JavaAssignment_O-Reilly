import java.util.Random;
import java.util.Scanner;

public class Chapter3_Project3 {
    public static void main(String[] args)
    {
        int guessCount=0;
        boolean guessedNumber=false;
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int randomNumber=random.nextInt(100)+1;

        while(!guessedNumber)
        {
            System.out.println("Enter your number: ");
            int inputNumber=sc.nextInt();
            guessCount++;
            if(inputNumber>=1 && inputNumber<=100)
            {
                if(inputNumber==randomNumber)
                {
                    System.out.println("Congratulations!! You guessed the number in "+guessCount+" guesses!! Thanks for Playing.");
                    guessedNumber=true;
                }
                else if(inputNumber>randomNumber)
                {
                    System.out.println("Your guess was too high!!!");
                }
                else
                {
                    System.out.println("your Guess was too low!!!");
                }
            }
            else
            {
                System.out.println("That was a wasted guess! You must pick a number between 1 ans 100 inclusive!!");
            }

        }

    }
}
