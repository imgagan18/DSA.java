import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2= new String("xyz");
         
        // strings are IMMUTABLE
         
        Scanner sc= new Scanner(System.in);
        String name;
        name=sc.next();
        System.out.println(name);
        sc.next();
    }
}
