import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt(),last,sum = 0;
        while (num>0){
            last = num %10;
            sum+=last;
            num = num/10;
        }
        System.out.println(sum);
    }
}
