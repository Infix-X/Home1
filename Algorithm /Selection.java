public class SelectionSort {
    public static boolean selctiso(int arr[]){
        //int i;
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;

                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        return true;
    }
    public static boolean printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("\n"+arr[i]);
        }
        System.out.println(" ");
        return true;
    }
    public static void main(String[]args){
        int arr[]={5,4,3,2,1,1};
        selctiso(arr);
        printArray(arr);

    }
    
}
