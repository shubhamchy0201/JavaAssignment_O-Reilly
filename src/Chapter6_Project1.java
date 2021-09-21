import java.util.ArrayList;
import java.util.Random;

public class Chapter6_Project1 {
    public static void main(String[] args)
    {
        Random random=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        final int TOTAL_NUM=10;
        for(int i=0;i<TOTAL_NUM;i++)
        {
            list.add(random.nextInt(100));
        }
        int totalSum=sum(list);
        System.out.println("Total sum of list is: "+totalSum);
    }

    private static int sum(ArrayList<Integer> list) {
        int total=0;
        for(int k:list)
            total+=k;

        return total;
    }
}
