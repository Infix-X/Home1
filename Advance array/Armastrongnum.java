import java.util.*;

public class Armastrongnum {
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
    public static void main(String[]args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println(  printArmastrong(num));
        if(isArmstrong(num)){
            System.out.println(num+" is an Armstrong number");
        }
        else{
            System.out.println(num+" is not an Armstrong number");
        }
        


    }
}