import java.util.ArrayList;
import java.util.List;

class arrayList {

  public static int storeWater(ArrayList<Integer> height) {
    int maxWater = 0;
    for (int i = 0; i < height.size(); i++) {
      for (int j = i + 1; j < height.size(); j++) {
        int ht = Math.min(height.get(i), height.get(j));
        int widht = i - j;
        int currentWater = ht * widht;
        maxWater = Math.max(maxWater, currentWater);
      }

    }
    return maxWater;
  }

  // based on 2 pointer approach(pair sum -1)
  public static boolean pointer(ArrayList<Integer>list,int target){
         int lp=0;
         int rp=list.size()-1;

         while(lp!=rp){
           if(list.get(lp)+list.get(rp)==target){
            return true;
           }
           if(list.get(lp)+list.get(rp)<target){
            lp++;
           }
           else{
            rp--;
           }
         }
         return false;
            }

  public static boolean Pairsum(ArrayList<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) + list.get(j) == target) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // [1,8,6,2,5,4,8,3,7]
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    
    
    int target = 5;
    System.out.println(pointer(list, target));
  }
}
