import java.io.*;
public class Trapping_Water {
        //maxLEftHight
        public static int Trapping_Water1(int height[]){
            //calculate leftmax
            //Creat Auxillary array for calculating leftmax
        int LeftMax[]=new int[height.length];
        LeftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }    
        //calculate rightmax
        //by using auxillary array
        int RightMax[] =new int[height.length];
        RightMax[height.length-1]=height[height.length-1];
         
        for(int i=height.length-2;i>=0;i--){
           RightMax[i] =Math.max(height[i],RightMax[i+1]);
        } 
        int  WatterTrapped=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(LeftMax[i],RightMax[i]);
            //Clculating WaterTrapped
            WatterTrapped=WatterTrapped+(waterLevel-height[i]);
        }
        return WatterTrapped;
        }
        

    public static void main(String[]args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Trapping_Water1(height));

    }
}
