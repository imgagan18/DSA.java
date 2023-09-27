public class selection {

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       int arr[]={9,2,4,5,5,1};

       //selection sort

       for(int i=0;i<arr.length;i++){
        int smallest=i;

        for (int j=0; j<arr.length;j++){
            if(arr[smallest]>arr[i]){
                smallest=j;
            }
        }

        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
       }
       PrintArray(arr);

    }
}
