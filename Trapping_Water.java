import java.io.*;
public class Trapping_Water {
        //maxLEftHight
        public static int Trapping_Water(int height[]){
            int n=height.length;
            int LeftMax[]=new int[n];
            LeftMax[0]=height[0];
            for(int i=1;i<n;i++){
                LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
            }
            //rightmax
             int RightMax[]=new int[n];
            RightMax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                RightMax[i]=Math.max(height[i],RightMax[i+1]);
            }
            //Count the water level first
            //then count watertrapped;
            int WaterTrapped=0;
            for(int i=0;i<n;i++){
                int WaterLevel=Math.min(LeftMax[i],RightMax[i]);
                WaterTrapped+=WaterLevel;

            }
            return WaterTrapped;
        }
        

    public static void main(String[]args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Trapping_Water(height));

    }
}
