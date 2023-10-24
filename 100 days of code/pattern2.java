public class pattern2 {
    public static void main(String[] args) {
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                if((i==0 || i==7 )||(j==0 || j==7)){
                System.out.print("*" +" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println("  ");

            }

        
    }
    
}
