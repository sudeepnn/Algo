
import java.util.*;
class Mergersort{
    public void merge(int arr[],int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int res_arrar[] = new int[10000];
        while(i<=mid&&j<=high)
        {
            if(arr[i]<arr[j])
                res_arrar[k++]=arr[i++];
            else
                res_arrar[k++]=arr[j++];
        }
        while(i<=mid)
            res_arrar[k++]=arr[i++];
        while(j<=high)
            res_arrar[k++]=arr[j++];
        for(int l=low; l<=high; l++)
        {
            arr[l]=res_arrar[l];
        }
    }

    public void divise(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divise(arr,low,mid);
            divise(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
}


public class program5 {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int array[]=new int [10000];
            int n=0;
            System.out.print("1.SYSTEM INPUT\n2.RANDOM NUMBER GENERATION \nENTER THE CHOICE -->");
            int choice = sc.nextInt();
            sc.close();
            switch(choice)
            {
                case 1:{
                    System.out.println("Enter the Number of Elements : ");;
                    n = sc.nextInt();
                    System.out.println("Enter "+n+" array elements ");
                    for(int i=0; i<n; i++)
                    {
                        array[i]=sc.nextInt();
                    }
                }
                break;
    
                case 2:
                {
                    System.out.println("Enter the Number of Elements : ");;
                    n = sc.nextInt();
                    for(int i=0; i<n; i++)
                    {
                        array[i]=rand.nextInt(1000);
                    }
                }
                break;
    
                default:System.out.println("Invalid Choice !!");
            }
            Mergersort  obj = new Mergersort();
            System.out.print("Array to be Sorted -->");
            for(int i=0; i<n; i++)
            {
                System.out.print(array[i]+"  ");
            }
            System.out.println();
            long start = System.nanoTime();
            obj.divise(array,0,n-1);
            long end = System.nanoTime();
            System.out.print("Sorted array-->");
            for(int i=0; i<n; i++)
            {
                System.out.print(array[i]+"  ");
            }
            System.out.println("Time -->"+(end-start));
        }
}
