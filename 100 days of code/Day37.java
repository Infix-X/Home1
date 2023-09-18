import java.util.Scanner;

public class Day37 {
    public static  boolean printfrequency(String str,int i,int count){
        for(i =0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                System.out.println(str.charAt(i)+":"+count);
            }
            else{
                System.out.println(str.charAt(i)+":"+1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(printfrequency(str,0,0));
        
        
        
    }
    
}
