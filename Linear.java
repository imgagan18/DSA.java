import java.util.Scanner;

public class Linear {

    static int Search(int []arr,int n , int x)
        {
            for(int i=0;i<n;i++){
                if (arr[i]==x)
                return i ;
            }
            return -1;
        }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter the element");
        int x= sc.nextInt(); 
       int index=Search(arr, n, x);
        if (index==-1)
        {
            System.out.println("the element is not in the array");
        }
        System.out.println("the element is " + index);
    }
}
