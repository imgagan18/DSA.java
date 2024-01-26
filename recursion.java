// public class recursion {
//      public static void main(String[] args) 
//      {
//         print(10);
       
//      }
//      static int print(int n)
//      {
//         if(n==0)
//         {
//             return n;
//         }
//         {
//             // print(n-1);   

//         System.out.println(n);
//         return print(n-1);   
//         }
//     }
// }

public class recursion {
    public static void PrintDec(int n){
        if(n==0){
            System.out.println(n); 
            return ; 
        }
        System.out.println(n);
        PrintDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        PrintDec(n);
    }
}