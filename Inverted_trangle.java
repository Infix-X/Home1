  class Inverted_trangle{
    public static void main(String[]args){
     
        int n=6;
        //halfperiod
        for(int i=1;i<=n;i++){

            //star
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            //space
            for(int j=1;j<=2*(n-1);j++){
                System.out.println(" ");
            }
             for(int j =1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
            
        }
        //halfperiod
        for(int i=n;i>=n;i--){
            //star
            //star
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            //space
            for(int j=1;j<=2*(n-1);j++){
                System.out.println("");
            }
             for(int j =1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();

    }
    }
}