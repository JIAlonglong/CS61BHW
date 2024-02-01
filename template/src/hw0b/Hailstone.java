package hw0b;
import java.util.ArrayList;
import java.util.List;
public class Hailstone {
    public static List<Integer> hailstone(int n){
        List<Integer> sequence=new ArrayList<>();
        sequence.add(n);
        hailstoneHelper(n,sequence);
        return sequence;
    }

    private static void hailstoneHelper(int n, List<Integer> s){
        if (n==1){
            return;
        }
        if (n%2==0){
            n=n/2;
        }else {
            n=3*n+1;
        }
        s.add(n);
        hailstoneHelper(n,s);
    }
}
