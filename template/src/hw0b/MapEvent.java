package hw0b;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class MapEvent {
    public static Map<Integer,Character> LetterToNum(){
        Map<Integer,Character> map = new TreeMap<>();
        char letter = 'a';
        for (int i = 1;i<=26;i++){
            map.put(i,letter);
            letter++;
        }
        return map;
    }

    public static Map<Integer,Integer> Square(List<Integer> nums){
        Map<Integer,Integer> map=new TreeMap<>();
        if (nums.isEmpty()){
            return new TreeMap<>();
        }
        else {
            for (int i : nums){
                for (int j :nums){
                    if (i*i==j){
                        map.put(i,j);
                    }
                }
            }
            return map;
        }
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordCountMap = new TreeMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }
}
