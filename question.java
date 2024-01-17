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
       for(int i=0; i < path.length();i++){
         char dir=path.charAt();
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

    }
    public static void main(String[] args) {
        String path="xyz";
    }
}
