import java.util.Scanner;

public class Day34 {
    
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        StringBuilder sb = new StringBuilder(str.length());
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != '(' &&  str.charAt(i) != ')' ){
                sb.append(str.charAt(i));
        }
    }
      System.out.println(sb.toString());
       
}

}
