public class SumOfSubarray {

    public static void SumOfSubarray(int Numbers[]) {
        int Currsum = 0;

        int maxSum = Integer.MIN_VALUE;
        int pp[] = new int[Numbers.length];

        pp[0] = Numbers[0];

        for (int i = 1; i < pp.length; i++) {
            pp[i] = Numbers[i] + pp[i - 1];
        }

        for (int i = 0; i < Numbers.length; i++) {
            int start = i;
            for (int j = i; j < Numbers.length; j++) {
                int end = j;
                Currsum = start == 0 ? pp[end] : pp[end] - pp[start - 1];

                System.out.println(Currsum);
                if (maxSum < Currsum) {
                    maxSum = Currsum;
                }

            }

        }
        System.out.println("max sum if " + maxSum);
    }

    public static void main(String[] args) {
        int Numbers[] = { 1,-2,6,-1,3 };

        SumOfSubarray(Numbers);
    }
}
