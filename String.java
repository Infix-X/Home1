Reverse string without affecting special keyword..
import java.io.*;
public class ReverseArray {
   public static boolean Rever(char str[]){
    int r=str.length-1;
    int l=0;
    while(l<r){
        //ignore special keyword
    if(!Character.isAlphabetic(str[l])){
        l++;
        }
        else if(!Character.isAlphabetic(str[r])){
        r--;
        }
        else{
           char temp= str[l];
            str[l]=str[r];
            str[r]= temp;
            l++;
            r--;
        }

    }
    return true;
}
    public static void main(String[]args){
        String ch="abc&&hgi";
        //string to char array;
        char []str=ch.toCharArray();
        System.out.println("Input string: " + str);
        System.out.println(Rever(str));
        String revstr=new String(str);
        System.out.println(revstr);

    }
    
}
