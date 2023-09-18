import java.util.Scanner;
import java.util.*;

public class Day31 {
    public static StringBuffer getChangeCase(String s) {
        StringBuffer buffer = new StringBuffer(s.length());
        String s1="";
        for(int i=0;i<s.length();i++) {
            if(Character.isUpperCase(s.charAt(i))){
                s1=s1+Character.toLowerCase(s.charAt(i));

            }
            else{
                s1 =s1+Character.toUpperCase(s.charAt(i));
            }


        }
        return buffer.append(s1);
    }
        
   
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(getChangeCase(str1));
        
    }
}
