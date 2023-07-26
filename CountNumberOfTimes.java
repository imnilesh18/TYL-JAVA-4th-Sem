import java.util.Scanner;

public class CountNumberOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int chosen = sc.nextInt();
        int count = 0;
        while(number>0){
            int digit = number%10;
            if (digit == chosen){
                count = count +1;
            }
            number = number/10;
//            System.out.println(number);
        }
        System.out.println(count);
    }
}
