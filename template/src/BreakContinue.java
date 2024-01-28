public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {

            }
            else {
                if(i+n>a.length)
                {
                    System.out.println("There is no enough index!please check!");
                    break;
                }
                else {
                    int j =1;
                    while(i+j<i+n)
                    {
                        a[i]+=a[i+j];
                        if (a[i+j]<0){
                            a[i]+=0;
                        }
                        j++;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
