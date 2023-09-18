public class Day35 {
/*Get a string from the user and find the sum of numbers in the string.

Input

Hello56

Output

11 */

    public static void main(String[] args) {
        String str ="abc17";
        int sum =0;
        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i)))
                sum += Character.getNumericValue(str.charAt(i));
            }
        System.out.println(sum);

    
}
    
}
