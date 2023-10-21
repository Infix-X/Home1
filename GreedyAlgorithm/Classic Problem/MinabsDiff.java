import java.util.*;
public class MinabsDiff {
    public static void main(String[] args) {
        int A[]={5,39,5,27,50};
        int B[]={24,60,28,40,90};
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("The min diff is:"+minDiff);
    }
    
}
