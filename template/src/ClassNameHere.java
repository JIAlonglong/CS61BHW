public class ClassNameHere {
    /**
     * Returns the maximum value from m.
     */
    public static int max(int[] m) {
        int i = m.length;
        int k = 0;
        for (int j=1;j<i;j++){
            if (m[j]>k)
            {
                k=m[j];

            }
        }
        return k;
    }

    /** Uses a while loop to sum a. */
    public static int whileSum(int[] a) {
        int i = 0; //initialization
        int sum = 0;
        while (i < a.length) { //termination
            sum = sum + a[i];
            i = i + 1; //increment
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(max(numbers));
    }
}

