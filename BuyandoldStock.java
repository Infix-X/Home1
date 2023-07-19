public class BuyandoldStock {
    public static int MaxProfitGain(int a[]){
        int minSofar=a[0];
        int maxProfit=0;
        for(int i=0;i<a.length;i++){
            minSofar=Math.min(minSofar,a[i]);
            int profit=a[i]-minSofar;
            maxProfit=Math.max(maxProfit,profit);

        }


        return maxProfit;

    }
    public static void main(String[]args){
        int stock[]={5,2,1,6,1,4};
        System.out.println(MaxProfitGain(stock));
    }
    
}
