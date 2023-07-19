public class pairs_in_array {

    public static  boolean reverse(int ar[]){
        int n=ar.length;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-1;j++){
            System.out.println("("+ ar[i]+","+ar[j]+")");
            }
        }
        return true;
        
    }
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        System.out.print(reverse(a));
    }
    
}
