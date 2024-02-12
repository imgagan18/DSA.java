public class recursion {
    public static void PrintInc(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        PrintInc(n-1);
        System.out.println(n+"");
    }
    public static void PrintDec(int n){
        if(n==0){
            System.out.println(n); 
            return ; 
        }
        System.out.println(n);
        PrintDec(n-1);
    }

    public static int Fact(int n){
        if(n==0){
            return 1;
        }
       int fnm1=Fact(n-1);
       int fn=n*Fact(n-1);
       return fn;
    }

    public static int CalCum(int n ){
        if(n==1){
            return 1;
        }
        int snm1=CalCum(n-1);
        int sm=n+snm1;
        return sm;
    }

    public static int Fib(int n){

         if(n==0|| n==1){
            return n;
         }
        int fnm1=Fib(n-1);
        int fnm2=Fib(n-2);

        int fn=fnm1+fnm2;

        return fn;

    }

    public static boolean Sorted(int arr[],int i ){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sorted(arr, i+1);
    }

    public static int FirstOcc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return FirstOcc(arr,key, i+1);
    }


    public static void main(String[] args) {//driver code 
      int arr[]={1,2,7,4,8,779,75,6};
      int key=23;
      
      System.out.println(FirstOcc(arr, 7,8));
    }
}