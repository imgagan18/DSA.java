public class pairArray {


    public static void Subarray(int Numbers[]){
        int ts=0;

        for (int i=0; i < Numbers.length ; i++){
            int start=i;
            for (int j=i;j<Numbers.length;j++){
                int end=j;
                for (int k=start;k<=end ; k++){
                    System.out.println(Numbers[k]+ " " );

                }
                ts++;
                System.out.println();
            }
            System.out.println( );
        }
        System.out.println("the number is" + ts);
    }
    
    public static void main(String[] args) {
        int Numbers[]={2,4,6,8,10};

        Subarray(Numbers);
    }
}
