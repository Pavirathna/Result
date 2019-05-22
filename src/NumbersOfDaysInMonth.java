import java.util.Scanner;

    public class NumbersOfDaysInMonth {

        public static void main(String[] args) {

                Scanner s1 = new Scanner(System.in);
                System.out.println("Enter the year");
                int year = s1.nextInt();
            System.out.println(isLeapYear(year));
            }

        private static boolean isLeapYear(int year) {
            if ((year % 4 == 0) &&( year>0&&year<9999)){
                if ((year % 100 == 0)) {
                    if (year % 400 != 0) {
                          return false;
                    }
                }
                 return  true;
                 }
                 else
                {
                  return false;
                }
        }
    }




