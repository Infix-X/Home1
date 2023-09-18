import java.util.Scanner;

public class Day26
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("MAximum number of Handshake are:"+((n-1)*n)/2);
    }

}