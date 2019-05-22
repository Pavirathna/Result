import java.util.Scanner;

public class NumbersOfDaysInMonth {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = s1.nextInt();
        System.out.println(isLeapYear(year));
        System.out.println(isLeapYear(2,2000));
    }

    public static boolean isLeapYear(int year) {
        boolean check=false;
        if ((year % 4 == 0) &&( year>0&&year<9999)){
            if ((year % 100 == 0)) {
                if (year % 400 != 0) {
                    //return check;
                    return false;
                }
            }
            check=true;             //return  true;
        }
        return check;   // return false;
    }

    public static int  isLeapYear(int Month,int Year)
    {
        int m=Month;
        switch (m)
        {
            case 2:
                if (isLeapYear(Year))
                {
                    return 29;
                }
                return 28;
            break;
            case 1: case 3: case 5: case 7: case 8: case 10:case 12:
            return 31;
            break;

            case 4: case 6: case 9: case 11:
            return 30;
            break;
            default:
                return -1;
        }

    }
  }




