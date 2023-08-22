import java.util.*;
public class kthsmallestElement{
    
    public static int kthSmallest(int[]matrix, int k) {
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        
            for(int j=0;j<matrix.length;j++){
                queue.add(matrix[j]);
               
                }
                for(int i=k;k<=matrix.length;i++){
                    if(queue.peek() >matrix[i]){
                        queue.poll();
                        queue.add(matrix[i]);
                    }
                }
                return queue.peek();

            }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] matrix = new int[n];
        for(int i=0;i<n;i++){
            matrix[i] = sc.nextInt();
        }
        System.out.println(kthSmallest(matrix, k));
    

}
}
