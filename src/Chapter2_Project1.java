import java.util.Scanner;

public class Chapter2_Project1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three Numbers:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();

        double avg=(a+b+c)/3.0;
        System.out.println("Average of three numbers :"+avg);
    }
}
