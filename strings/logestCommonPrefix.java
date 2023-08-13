import java.util.Arrays;

public class LongestCommonPrefix {
    public static String LongnCommPrefix(String str[]){
        if(str.length==0){
            return "";
        }
        if(str.length==1){
            return str[0];

        }
        String len="";
        Arrays.sort(str);
        int end =Math.min(str[0].charAt(0), str[str.length-1].charAt(str.length));
        int i =0;
        while(i<end && str[0].charAt(i)==str[str.length-1].charAt(i)){
             i++;
            len =str[0].substring(0, i);
           
        }
        return len;
    }
    public static void main(String[] args) {
        String str [] ={"GeekForGeek","Geek","Geezer"};
       System.out.println( LongnCommPrefix(str));
    }
    
}
