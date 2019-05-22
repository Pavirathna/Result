import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        //System.out.println(isPolindrome(num));
        System.out.println(sumFirstLastDigit(num));
    }
    public static int sumFirstLastDigit(int num)
    {
        int n=num;
        int count=0;
        while(n!=0)
        {
            n/=10;
            count++;
            System.out.println("c"+count);
        }
        int c=count;
        while(num >= 0) {
         int  a = num % 10;
            if ((count == c)||(count==2)) {
                System.out.println("a"+count);
                a += num;
                }
             num /= 10;
           System.out.println("n"+num);
            count--;
            System.out.println("c"+count);
            return a;
        }
        return-1;
    }
}
