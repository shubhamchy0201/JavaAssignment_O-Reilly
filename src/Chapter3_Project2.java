import java.util.Scanner;

public class Chapter3_Project2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int input=sc.nextInt();

        if(input%3==0)
            System.out.println(input+" is divisible by 3.");
        else
            System.out.println(input+" is not divisible by 3.");

    }
}
