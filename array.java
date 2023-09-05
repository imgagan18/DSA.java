// import java.util.*;

public class array {

    public static int LinearSearch(int number[], int key){

      for(int i=0 ; i<number.length; i++){
             if(number[i]==key){
              return i;
             }
      }
      return -1;
    }
  public static void main(String[] args) {

    int number[]={2,4,6,8,10,12,14,16};
    int key=99 ;

       int index=LinearSearch(number,key);
       if(index==-1){
        System.out.println("the number not found ");
       }else{
        System.out.println("key is at index" + index);
       }


  }
}