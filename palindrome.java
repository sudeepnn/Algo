import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int tp=n;
    int rev=0;
    while(n>0){
     rev=(rev*10)+(n%10);
     n/=10;
    }
    if(tp==rev)
      System.out.println("Palindrome");
    else
      System.out.println("Not palindrome");
  }
}
