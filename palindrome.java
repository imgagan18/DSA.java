public class palindrome {

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
        //substing
      }
      return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(ispalindorme(str));
    }
}
