import java.util.Scanner;

public class Day41 {
   

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            String str1 = sc.nextLine();
            String str2= sc.nextLine();
            for(int i=0; i<str1.length(); i++) {
                for(int j=0; j<str2.length(); j++){
                    while(str1.charAt(i)==! || str1.charAt(i)==?){
                         if(str1.length()==str2.length()){
                            if(i==j){
                            System.out.println("Equals");
                            }

                    }
                    }
                    
                   
                }
            
        }
    
}
