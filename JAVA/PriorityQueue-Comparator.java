import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        int min=1000;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            if(x<y && x<min){
                min=x;
            }else if(y<x && y<min){
                min=y;
            }
            if(x==1){
               q.add(y);
            }
            if(x==2){
                if(!q.isEmpty()){
                    System.out.println(q.peek());
                }else{
                    System.out.println(-1);
                }
            }
            if(x==3){
                if(!q.isEmpty()){
                   q.poll();
                }
            }
        }

    }
