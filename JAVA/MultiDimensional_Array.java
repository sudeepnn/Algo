import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int [][]ar=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                ar[i][j]=in.nextInt();
            }
        }
         for(int i=0;i<b;i++){
             int sum=0;
            for(int j=0;j<a;j++){
               sum+= ar[j][i];
            }
            System.out.print(sum+" ");
        }
        
    }
}
