public class bubble {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
          for(int j=0; j<arr.length-1; j++){
            if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
          }
        }
    }
        
    public static void Printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
        }
    }
  public static void main(String[] args) {
    int arr[]={9,2,4,5,5,1};
    bubbleSort(arr);
    Printarray(arr);
  }
}
