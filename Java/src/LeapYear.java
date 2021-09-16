/* Leap Year
A leap year is exactly divisible by 4 except for century years (years ending with 00).
The century year is a leap year only if it is perfectly divisible by 400.*/



import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        sc.close();
        if(year%4==0&&year%10!=0||year%400==0)
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year+" is not a leap year.");
    }
}
