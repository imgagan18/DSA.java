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

    public static String substirng(String str, int si, int ei){
        String substr="";
        for(int i= si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    // public static void main(String[] args) {
    //     //Substirng
    // //  String str="helloworld";
    // //  System.out.println(substirng(str, 0, 8));

    //     String fruits[]={"apple","mango","bananana"};
    //      String largest= fruits[0];

    //      for(int i=0;i<fruits.length;i++)
    //      {
    //         if(largest.compareTo(fruits[i])<0){
    //            largest=fruits[i];
    //         }
    //      }
    //      System.out.println(largest);

    //    } 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
sb.append(ch);
        }
System.out.println(sb.length());

    }
    }

