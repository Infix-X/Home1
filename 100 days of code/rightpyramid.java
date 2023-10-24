public class rightpyramid {
    public static void main(String[] args){
        for(int i=1;i<=7;i++){
            for(int space=0;space<=7-i;space++){
                System.out.print(" "+" ");
            }
            for(int star=0;star<=i;star++){
                System.out.print("*" +" ");
            }
            System.out.println(" ");
        }
    }
    
    
}
