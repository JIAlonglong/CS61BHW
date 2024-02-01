package hw0b;

public class DiceAndOrder {
    public static int[] MakeDice(){
        return new int[] {1,2,3,4,5,6};
    }

    public static String[] takeOrder(String customer){
        if (customer.equals("Ergun")){
            return new String[] {"beyti","pizza","hamburger","tea"};
        } else if (customer.equals("Erik")) {
            return new String[] {"sushi","pasta","avocado","coffee"};
        }
        else {
            return new String[3];
        }
    }

    public static int FindMinMax(int[] numbers){
        int min=numbers[0];
        int max=numbers[0];
        for (int i = 0;i<numbers.length;i++){
            if (min>numbers[i]){
                min=numbers[i];
            } else if (max<numbers[i]) {
                max=numbers[i];
            }
        }
        return max-min;
    }

}

