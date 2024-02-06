public class sample {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s)
        );
    }
    static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char ch = s.charAt(i);

            for (int j = i + 1; j < s.length(); j++) {
                char ch2 = s.charAt(j);
                if (ch == ch2) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                return i;
            }
        }
        return -1;
    }
    }
    

