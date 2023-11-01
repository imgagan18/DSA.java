// pick an unsorted element from the list and place it or sort it inn the list one by one . each element is compared to the element to the left 


public class insertion {

    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
     int curr=i;
     int prev=i-1;
        while(prev>=0 && arr[prev] > arr[curr]){
        arr[prev+1]=arr[prev];
        prev--;
        }
        
        //insertion

        arr[prev+1]=arr[curr];
  
    }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,4,5,6,7};
        insertion(arr);
        Printarray(arr);
    }
}
