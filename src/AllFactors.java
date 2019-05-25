import java.util.Scanner;

public class AllFactors {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find all factors of the number :");
        int number=sc.nextInt();
        printFactors(number);
    }
    public static void printFactors(int number) {
        int i=1;
        while (i<=number)
        {
            if(number%i==0)
            {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("InvalidValue");
    }
}
