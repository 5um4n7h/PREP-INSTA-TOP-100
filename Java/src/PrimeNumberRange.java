import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting num  : ");
        int start = scanner.nextInt();
        System.out.println("Enter ending number : ");
        int end= scanner.nextInt();
        int count;
        for(int i=start;i<=end;i++){
            count = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }
            if(count == 2 && i != 1){
                System.out.println(i);
            }
        }
    }
}
