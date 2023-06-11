/*
Special Number:
A number is said to be special number when the sum of factorial of its digits is                                         .                      equal to the number itself.
Example- 145 is a Special Number as 1!+4!+5!=145.
*/
import java.util.Scanner;
public class SpecialNumber {
    public static void main(String args[]){
        int n, digit = 0, sum = 0, fact, i, OriginalNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();
        OriginalNumber=n;
        while(n>0) {
            digit = n % 10;
            n = n / 10;
//            System.out.println(digit);
//            System.out.println(n);
            fact =1;
            for (i = 1; i <= digit; i++) {
                fact = fact * i;
            }
//            System.out.println(fact);
            sum = sum + fact;
//            System.out.println(sum);
//            System.out.println("---------------------");
        }
        if (sum == OriginalNumber){
            System.out.println("Special Number");
        }
        else{
            System.out.println("Not Special Number");
        }
    }
}

//try: 145, 1, 2, 40585

