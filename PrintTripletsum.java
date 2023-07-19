public class PrintTripletsum {
    static int ar[] = {-2, 0, 1, 3};
    public static  boolean tripletsum(int sum){
        //fix the first element of array
        int ans=0;
        for(int i=0;i<ar.length-2;i++){
            //fix the second element
             for(int j=i+1;j<ar.length-1;j++){
                //fix third element
             for(int k=j+1;k<ar.length;k++){
                if(ar[i]+ar[j]+ar[k]<sum){
                ans++;}
            
           
        }
        //System.out.println(ans); 
           
        } 
        System.out.println(ans); 
        }
        System.out.println(ans); 
     return true;
    }
    public static void main(String[]args){
        
        int sum = 7;
        System.out.println( tripletsum( sum));
        
        
    }
    
    
}
