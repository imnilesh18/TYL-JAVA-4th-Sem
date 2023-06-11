/*
Perfect Number:
A number is said to be perfect if the sum of the factors including 1 and excluding the  number
is the same as the number itself.
sum of the Factors of 6 excluding 6:  1 + 2 + 3 = 6
*/
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String args[]){
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();
        for(i = 1; i < n; i++){
            if(n % i == 0){
                sum = sum + i;
//                System.out.println(sum);
            }
        }
        if(sum == n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}

//try: 6, 28, 496, 8128
