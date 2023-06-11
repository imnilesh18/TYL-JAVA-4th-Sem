import java.util.Scanner;
/*
A happy number is a positive integer that, when you repeatedly replace the number by the sum of the squares
of its digits, eventually reaches the number 1. If the process ends with 1, the number is considered a happy number.
If the process enters a cycle without reaching 1, the number is not a happy number.

Example: 19
1^2 + 9^2 = 1 + 81 = 82
8^2 + 2^2 = 64 + 4 = 68
6^2 + 8^2 = 36 + 64 = 100
1^2 + 0^2 + 0^2 = 1 + 0 + 0 = 1

Example: 4
4^2 = 16
1^2 + 6^2 = 1 + 36 = 37
3^2 + 7^2 = 9 + 49 = 58
5^2 + 8^2 = 25 + 64 = 89
8^2 + 9^2 = 64 + 81 = 145
1^2 + 4^2 + 5^2 = 1 + 16 + 25 = 42
4^2 + 2^2 = 16 + 4 = 20
2^2 + 0^2 = 4 + 0 = 4
So number should not end with 4 otherwise the loop will run endlessly.
*/
public class HappyNumber {
    public static void main(String args[]) {
        int n, i, sum, digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();
        while (n != 1 && n != 4) {
            sum = 0;
            while (n > 0) {
                digit = n % 10;
//                System.out.println(digit);
                sum += digit * digit;
//                System.out.println(sum);
                n /= 10;
//                System.out.println(n);
            }
            n = sum;
//            System.out.println(n);
        }
        if(n == 1){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not Happy Number");
        }
    }
}

//try: 19, 7, 28, 68, 82, 100, 139