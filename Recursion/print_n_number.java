package Recursion;

public class Recursion1 {
    //PRINT N NUMBER;
    public static boolean num(int n){
       if(n<1){
        System.out.println(n);
       }else{
         num(n-1);
    System.out.println(n);
        }
         return true;
       
 }
    public static void main (String[]args){
       //naeive appraoch
        // int n=8;
        // int sum =(n*(n+1))/2;
        // System.out.println(sum);
        int n=8;
         //num(n);
         System.out.println(num(8));
    }
    
}
