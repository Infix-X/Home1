public class Solid_rhombas{
    public static void main(String[]args){
        int n=6;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.println("");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.println("*");
            }
             System.out.println();
        }

    }
}