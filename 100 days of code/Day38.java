import java.util.Scanner;

public class Day38{

   public static boolean printnonrepe(String str){
    int frequency[] = new int[256];
    for(int i = 0; i < str.length();i++){
      frequency[str.charAt(i)]++;
    }
    System.out.println("The non repeating caracter are:");
    for (int i = 0; i < 256; i++){
    if (frequency[i] == 1)
    System.out.print ((char) i + " ");
   }
   
    return true;
}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String str =sc.nextLine();
    System.out.println(printnonrepe(str));
    
}
}