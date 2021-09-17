/*factorial
The factorial of a positive number n is given by:

factorial of n (n!) = 1 * 2 * 3 * 4 *...  * n
The factorial of a negative number doesn't exist. And the factorial of 0 is 1
 */


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(fact(num));

    }

    static int fact(int num){
        if(num==0||num==1)
            return 1;
        else return num*fact(num-1); //using recursion
    }

}
