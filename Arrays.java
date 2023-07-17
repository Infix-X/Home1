1)Pair
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

2)SubArray
  public class SubArrays {
    public static  boolean subarray(int ar[]){
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<=n-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(ar[k]);
                }
                 System.out.println();
            }
             System.out.println();
        }
        return true;
        
    }
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        System.out.print(subarray(a));
    }
}


3)MaxSubArraySum
  public class MaxSubArraysSum {
    public static  void subarray(int ar[]){
        int currSum=0;
        int MaxSum=Integer.MAX_VALUE;
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<=n-1;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=ar[k];
                    if(currSum<MaxSum){
                        MaxSum=currSum;
                    }
                  System.out.println();
                }
                 System.out.println();
            }
         }
        System.out.println(MaxSum);
     }
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        subarray(a);
    }
 }
