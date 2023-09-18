import java.util.Scanner;

public class Day29 {
    public static StringBuffer concatenation(String s1, String s2) {
        StringBuffer buffer = new StringBuffer();
        return buffer.append(s1).append(s2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(concatenation(str1, str2));

    }
    
}
