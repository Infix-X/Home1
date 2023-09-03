1import java.util.Scanner;
import java.util.*;

public class Alphabet {

    public static void main(String[] args) {

       Scanner sc =new Scanner(System.in);
       int num =sc.nextInt();
       int i=1;int sum=0;
       while(i<num){
        if(num%i==0){
            int LCM=i;
            sum += LCM;
            
        }
        i++;
        

       }
       //res=(num1>num2) ? (num1+num2):(num1-num2);
       String res=(sum==num) ? "Yes":"No";
       System.out.println(res);

    }
}