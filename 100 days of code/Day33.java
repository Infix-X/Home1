import java.util.Scanner;

public class Day33 {

    //check string is palindrome or not

    public static String reverse(String str) {
       StringBuilder sb = new StringBuilder(str.length());
        for(int i=str.length()-1;i>=0 ;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
       boolean yes = str.equalsIgnoreCase(reverse(str));
       if(yes){
        System.out.println("palindrome");
       }
       else{
        System.out.println("No palindrome!");
       }
    }
    
}
