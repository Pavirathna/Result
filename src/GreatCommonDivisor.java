import java.util.Scanner;

public class GreatCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers to check :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(getCommonDivisor(num1,num2));
    }
    public static int getCommonDivisor(int num1,int num2)
    {
        int k=0;
        if((isValid(num1))&&(isValid(num2)))
        {
           for(int i=2;i<=num1;i++)
           {
              for(int j=2;j<=num2;j++)
              {
                  if((num1%i==0))
                  {
                       if(num2%i==0)
                       {
                            k=i;
                       }
                  }
              }
           }
           return k;
        }
        return -1;
    }
    public static boolean isValid(int num1)
    {
        if(num1>=10&&num1<=1000)
        {
            return true;
        }
        return false;
    }
}
