package hw0b;
import java.util.ArrayList;
import java.util.List;
public class ListEvent {
    public static int Sum(List<Integer> L){
        if (L.isEmpty()){
            return 0;
        }else {
            int total=0;
            /** use plus for **/
            for (int num : L){
                total+=num;
            }
            return total;
        }
    }

    public static List<Integer> Evens(List<Integer> L){
        List<Integer> s = new ArrayList<>();
        boolean IfHave = false;
        for (int num : L){
            if(num%2==0){
                IfHave=true;
                s.add(num);
            }
        }
        if (!IfHave){
            return new ArrayList<>();
        }else {
            return s;
        }
    }

    public static int CountOccurrencesOFC(List<String> words,char c){
        int count = 0;
        for (String w : words){
            for (char ch : w.toCharArray()){
                if (ch==c){
                    count++;
                }
            }
        }
        return count;
    }
}
