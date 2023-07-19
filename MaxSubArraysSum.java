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
