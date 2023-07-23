public class PalinInte {
    public static boolean isPalindrome(int x) {
        int sum=0;
        if(x<0){
            return false;
        }
        // while(x>10){
        //     int temp=x%10;
        //     sum+=temp;
        //     x=x/10;
        //     }
           while (x > 0 && x > 10) { 
            int temp = x % 10;
            sum += temp;
            x = x / 10;
        }
        sum += x; 
            String str =String.valueOf(sum);
            String rev
            = new StringBuilder(str).reverse().toString();
            if((str).equals(rev)){
                return true;

            }
            return false;
        
    }
    public static void main (String[]args){
        int num=12145;
        System.out.println( isPalindrome(num));
    }
} 


ALL TEST CASES PASS by bellow onr----|||>
    class Solution {
    public boolean isPalindrome(int x) {
        // int sum=0;
        int rever=0;
        int temp=x;
        if(x<0){return false;}
        while(x>0 ){
            int digit =x%10;
            rever=(rever*10)+digit;
            x=x/10;

        }
        //sum+=x;

        if(rever==temp){
            return true;
        }
        return false;
    }
}






