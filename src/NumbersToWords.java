import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int number=sc.nextInt();
        System.out.println(getDigitCount(number));
    }
    public static int getDigitCount(int number)
    {
        int digit,count=0;
        int reverse=0;
        while(number>0) {
            digit = number % 10;
            number /= 10;
            count++;
        }
        return count;
    }
    public static int Reverse(int number)
    {
        int digit,count=0;
        int reverse=0;
        while(number>0) {
            digit = number % 10;
            reverse=(reverse*10)+digit;
            number /= 10;
            count++;
        }
         return reverse;
    }
    public static void numbersToWords(int number)
    {
        int digit,count=0;
        int reverse=0;
        while(number>0) {
            digit = number % 10;
            System.out.println();
            reverse=(reverse*10)+digit;
            number /= 10;
            count++;
        }
    }
    public static String numInWords(int number)
    {
        switch (number)
        {
            case 0:
                return "ZERO";
                break;
            case 1:
                return "ONE";
                break;
            case 2:
                return "TWO";
            break;
            case 3:
                return "THREE";
            break;
            case 4:
                return "FOUR";
            break;
            case 5:
                return "FIVE";
            break;
            case 6:
                return "SIX";
            break;
            case 7:
                return "SEVEN";
             break;
            case 8:
                return "EIGHT";
            break;
            case 9:
                return"NINE";
            break;
            default:
                return "INVALID VALUE";
        }

    }
}
