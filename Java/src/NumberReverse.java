import java.util.*;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        String numStr = num+"";
        String revStr="";
        for(int i=numStr.length()-1;i>=0;i--){
            revStr+=numStr.charAt(i);
        }

        int rev = Integer.parseInt(revStr);
        System.out.println(rev);
    }
}
