public class question {
    public static void loop(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }
    public static boolean ispalindorme(String str){
      for(int i=0;i<str.length();i++){
        int n=str.length();
        if(str.charAt(i) !=str.charAt(n-1-i)){
            return false;
        }
      }
      return true;
    }
    public static float getShortestpath(String Path){
       int x=0, y=0;
       for(int i=0; i<Path.length();i++){
         char dir=Path.charAt(i);
         if (dir=='s') {
           y--;            
         }
         else if (dir=='n') {
       y++;            
         }
         else if(dir=='e'){
            x++;
         }
         else if(dir=='w'){
            x--;
         }
       }

       int X2=x*x;
       int Y2=y*y;

       return (float)Math.sqrt(X2-Y2);

    }
    public static void main(String[] args) {
        String Path="abcdefggfedcba";
        System.out.println(getShortestpath(Path));
    }
}
