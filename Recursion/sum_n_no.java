 public static int num(int n){
        int sum =0;
       if(n==1){
        return n;
       }
       
        sum = n + num(n-1);
        
        return sum;
         
       
 }
    public static void main (String[]args){
       //naeive appraoch
        // int n=8;
        // int sum =(n*(n+1))/2;
        // System.out.println(sum);
        int n=8;
         //num(n);
         System.out.print(num(8));
    }
    
}
