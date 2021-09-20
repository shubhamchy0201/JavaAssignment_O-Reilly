import java.util.Scanner;

import static java.lang.System.out;


public class Chapter3_Project1 {
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        int baseCharge;
        int costPerCourse;
        int numIncluded;
        int totalCost;
        out.println("Enter the Package numnber: 1/2/3");
        int packageNumber = sc.nextInt();
        out.println("Enter the no of Courses: ");
        int noOfCourses = sc.nextInt();

        if(packageNumber==1)
        {
        baseCharge=10;
        costPerCourse=6;
        numIncluded=2;

        }
        else if(packageNumber==2)
        {
            baseCharge=12;
            costPerCourse=4;
            numIncluded=4;

        }
        else
        {
            baseCharge=5;
            costPerCourse=3;
            numIncluded=6;


        }//end if-else
        //Calculation of total cost

        if(noOfCourses>numIncluded)
        {
            totalCost = baseCharge + ((noOfCourses - numIncluded) * costPerCourse);
        }
        else
        {
            totalCost=baseCharge;
        }
        out.println("Total cost is $"+totalCost);

    }//end main

}
