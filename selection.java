public class selection {

    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selection(int arr[]){
        for(int i=0 ; i<arr.length-1; i++){
            int minpos=i;
            for(int j= i+1; j<arr.length ; j++){
                if(arr[minpos] > arr[j]) {
                    minpos=j;
                }
            }
            //swap


            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,4,7,9,29};
        selection(arr);
         Printarray(arr);
    }
}
