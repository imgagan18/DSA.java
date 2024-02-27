import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(55);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(22);
        list.add(68);

        int max= Integer.MIN_VALUE;

        for(int i =0 ;i<list.size(); i++){
            if(max < list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("the max of the given elements is "+ max);

    }
}
