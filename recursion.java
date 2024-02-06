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

    
    public static void main(String[] args) {//driver code 
        int n=25;
       System.out.println(Fib(n));
    }
}