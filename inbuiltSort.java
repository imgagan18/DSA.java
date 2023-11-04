import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static void Printarray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println();
        Integer arr[]={4,3,4,5,6,3,2,4,5,6,67,7,5};
        // Arrays.sort(arr);
        // Arrays.sort(arr,2,6);
        // this is the important line of the code ...
        
        // array for reverse order use the follwing function
       Arrays.sort(arr, Collections.reverseOrder()); 
       Printarray(arr);
    }
}


//0(nlogn) tine complexity
