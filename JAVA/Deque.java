import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            if(x==1){
               q.addLast(y);
            }
            if(x==2){
                q.addFirst(y);
            }
            if(x==3){
                if(!q.isEmpty()){
                    System.out.println(q.peekFirst());
                }else{
                    System.out.println(-1);
                }
            }
            if(x==4){
                if(!q.isEmpty()){
                    System.out.println(q.peekLast());
                }else{
                    System.out.println(-1);
                }
            }
            if(x==5){
                if(!q.isEmpty()){
                    q.removeFirst();
                }
            }
            if(x==6){
                if(!q.isEmpty()){
                    q.removeLast();
                }
            }
        }

    }
}
