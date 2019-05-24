import java.util.Scanner;

public class FlourPackProblem {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int BigCount = sc.nextInt();
        int SmallCount = sc.nextInt();
        int Goal = sc.nextInt();
        System.out.println(canPack(BigCount,SmallCount,Goal));
    }

    public static boolean canPack(int BigCount,int SmallCount,int Goal)
    {
        if((BigCount>=0)&&(SmallCount>=0)&& (Goal>=0)&&(BigCount<=Goal))
     {
         if((BigCount*5)+SmallCount>=Goal)
         {
            return true;
         }
     }
     return false;
    }
}
