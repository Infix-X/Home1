import java.util.Arrays;
import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean found=true;
        String a1=s1.replaceAll("[\\s]","").toLowerCase();
        String a2=s2.replaceAll("[\\s]","").toLowerCase();
        char array1[] = a1.toLowerCase().toCharArray();
        char array2[] = a2.toLowerCase().toCharArray();
        if(array1.length != array2.length){
           System.out.println("Not anagrams");
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean anagrams = Arrays.equals(array1, array2);
        if(anagrams){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
       
        
        
}
}
    
    

