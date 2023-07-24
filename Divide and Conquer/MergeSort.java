package Divide_and_conquer;

public class Merge_sort {
    public static void Merge_sort1(int arr[],int si,int ei)
    {
        if(si>=ei){return ;}
        int  mid=si+(ei-si)/2;
        Merge_sort1(arr, si, mid);
        Merge_sort1(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
 }
 public static boolean Merge(int arr[],int si,int mid,int ei){
    int temp[]=new int[ei-si+1];
    int i=si;//traversiing first starting index
    int j=mid+1;//taversing second half
    int k =0; //traversing the temp array
    if(i <= mid && j <= ei){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
        }
        if(arr[i] > arr[j]){
            temp[k++]=arr[j++];
        }

    }
    while(i <=mid){
        temp[k++]=arr[i++];
    }
      while(j <=ei){
        temp[k++]=arr[j++];
    }
    
 } 

    public static void main(String[]args){
        int arr[]={6,3,5,9,2,8};
       System.out.printf( Merge_sort1(arr, 0,arr.length-1));    
    }
    
}
