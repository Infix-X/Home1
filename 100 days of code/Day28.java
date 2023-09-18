import java.util.Scanner;

public class Day28 {
    public static StringBuffer reverse(String str){
        StringBuffer buffer = new StringBuffer(str.length());
         buffer.append(str);
        return buffer.reverse();
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String Str = scanner.nextLine();
        System.out.println(reverse(Str));

        
    }
    
}
