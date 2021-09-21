import java.util.ArrayList;
import java.util.Scanner;

public class Chapter5_Project1 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        ArrayList<String> firstName=new ArrayList<>();
        ArrayList<String> lastName=new ArrayList<>();
        String fullName;
        String fName;
        String lName;
        int indexOfSpace;
        final int NUM_NAME=5;
        for(int i=0;i<NUM_NAME;i++)
        {
            System.out.println("Please enter the "+ (i+1)+" full name");
            fullName=input.nextLine();
            indexOfSpace=fullName.indexOf(" ");
            fName=fullName.substring(0,indexOfSpace);
            lName=fullName.substring(indexOfSpace+1);
            firstName.add(fName);
            lastName.add(lName);
        }

        //for permutation
        for (int i=0;i<firstName.size();i++)
        {

            for (int j=0;j< lastName.size();j++)
            {
                System.out.print(firstName.get(i)+" ");
                System.out.println(lastName.get(j));
            }
        }
    }
}
