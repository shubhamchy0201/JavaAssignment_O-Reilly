import java.util.ArrayList;
import java.util.Scanner;

public class Chapter4_Project3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> nameList=new ArrayList<>();
        ArrayList<Integer> ageList=new ArrayList<>();
        String name;
        int age;

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a name:\t");
            name=sc.nextLine();
            System.out.print("Enter an age:\t");
            age= sc.nextInt();

            sc.nextLine();
            nameList.add(name);
            ageList.add(age);
            System.out.println();
        }

        for(int i=0;i< nameList.size();i++)
        {
            System.out.println(nameList.get(i)+" is "+ageList.get(i)+" years old.");
        }
    }
}
