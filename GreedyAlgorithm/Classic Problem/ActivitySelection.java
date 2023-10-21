import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,2,3,6,8,9};
        int end[]={3,5,8,9,10,12};
        int mat[][]=new int[start.length][3];
        for(int i =0;i<start.length;i++){
            mat[i][0]=i;
            mat[i][1]=start[i];
            mat[i][2]=end[i];
        }
        Arrays.sort(mat,Comparator.comparingDouble(o->o[2]) );
        
        ArrayList<Integer>ans=new ArrayList<>();
        int maxAct=1;
        ans.add(mat[0][0]);
        int lastIndex=mat[0][2];
        for(int i=1;i<end.length;i++){
            if(mat[i][1]>=lastIndex){
                maxAct++;
                ans.add(mat[i][0]);
                lastIndex=mat[i][2];
            }
        }
        System.out.println("The  maximum activity performed are:"+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }
        System.out.println();
    
    }
    
}
