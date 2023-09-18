import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         String str1=sc.nextLine();
         int count =0;
         for(int i=0;i<str1.length();i++){
            count++;
         }
         System.out.println(count);
    }
    
}
