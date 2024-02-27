class arrayList{

    public static void Swap(int arr[],int index1,int index2){ 
       int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
        int numbers[]={3,4,5,6,7,8};
        System.out.println(numbers);
        int index1=2;
        int index2=4;
        Swap(numbers, index1, index2);

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        

    }
}
