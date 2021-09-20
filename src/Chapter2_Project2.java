import java.util.Scanner;

public class Chapter2_Project2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an adjective:\t");
        String adjective1=sc.next();
        System.out.print("Enter a girl name:\t");
        String name_Girl=sc.next();
        System.out.print("Enter another adjective:\t");
        String adjective2=sc.next();
        System.out.print("Enter an Occupation:\t");
        String occupation1=sc.next();
        System.out.print("Enter the name of a place:\t");
        String place_Name=sc.next();
        System.out.print("Enterthe name of piece of clothing:\t");
        String name_clothing=sc.next();
        System.out.print("Enter the name of a hobby:\t");
        String hobby=sc.next();
        System.out.print("Enter another adjective:\t");
        String adjective3=sc.next();
        System.out.print("Enter another Occupation:\t");
        String occupation2=sc.next();
        System.out.print("Enter a boy's name:\t");
        String name_Boy=sc.next();
        System.out.print("Enter a man's name:\t");
        String name_Man=sc.next();

        System.out.println("There once was a "+adjective1+" girl named "+name_Girl+", who was a "+adjective2+" "+occupation1+" in the Kingdom of "+
                place_Name+".\nShe loved to wear "+name_clothing+" and to "+hobby+".She wanted to marry the "+adjective3+" "+occupation2+
                " named "+name_Boy+" but her father, King "+name_Man+" forbid her from seeing him.");
    }
}
