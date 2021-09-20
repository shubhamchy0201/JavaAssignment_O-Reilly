import java.util.ArrayList;
import java.util.Scanner;

public class Chapter4_Project2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> list=new ArrayList<>();
        System.out.println("Please enter 0 or more to put in the list or -1 to exit: ");
        double input=sc.nextDouble();
        while(input>=0)
        {
            list.add(input);
            System.out.println("Please enter 0 or more to put in the list or -1 to exit: ");
            input=sc.nextDouble();
        }
        for(int i=list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
    }
}
