//Prime Number
//        Prime Number are the whole numbers which have two factors i.e. 1 and the number by itself. Some of the facts for the prime numbers are given below :-
//
//        0 and 1 are not considered as prime number.
//        Except for 0 and 1, a number is either a prime number or a composite number.
//        Numbers that have more than two factors are called composite numbers.
//        The  1 is neither prime nor composite.
//        Except 2, all other even numbers are not prime.
//        The first 25 prime numbers (all the prime numbers less than 100) are : 2, 3, 5, 7, 11, 13, 17, 19, 23
//        29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no :");
        int num = scanner.nextInt(),count = 0;
        scanner.close();
        for(int i=1;i<=num;i++)
            if(num%i==0)
                count++;
        if(count == 2)		                        //if factors are two then, number is prime else not
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
