import java.util.Scanner;

public class Chapter4_Project1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number[]=new int[5];
        for(int i=0;i<number.length;i++)
        {
            System.out.println("Enter the number: ");
            number[i]=sc.nextInt();
        }
        for(int k:number)
            System.out.println("Result is: "+(k*2));
    }
}
