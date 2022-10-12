import java.lang.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int i=0;
        int pos;
        while(true){
            arr.add(in.nextInt());
            if(arr.get(i)<0){
                break;
            }
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr.get(j)+" ");
        }

    }
}
