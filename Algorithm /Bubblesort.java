public class BubbleSort {
    public static boolean Bubblesort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=0;j<=arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
            

        }
     return true;
     //System.out.println(" ");
    }
    public static boolean printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("\n"+arr[i]);
        }
        System.out.println(" ");
        return true;
    }

    public static void main(String[]args){
        int arr []={5,4,1,3,2};    
        System.out.print( Bubblesort( arr));
        System.out.print( printArray( arr));
    }

    }
