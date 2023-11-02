import java.util.Arrays;
public class inbuiltSort {
    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println();
        int arr[]={4,3,4,5,6,3,2,4,5,6,67,7,5};
        Arrays.sort(arr);// this is the important line of the code ...
        Printarray(arr);
    }
}


//0(nlogn) tine complexity
