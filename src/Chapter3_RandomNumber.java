import java.util.Random;

public class Chapter3_RandomNumber {
    public static void main(String[] args)
    {
        //Generating random numbers
        Random random=new Random();
        int num1=random.nextInt();
        System.out.println(num1);

        //Generating number between 0-999
        int num2=random.nextInt(1000);
        System.out.println(num2);

        //Shifting
        int num3=random.nextInt(1000)+1;
        System.out.println(num3);

        //DiceSimulation

        for(int i=1;i<=10;i++)
        {
            int num4=random.nextInt(6)+1;
            System.out.println(num4);
        }
    }
}
