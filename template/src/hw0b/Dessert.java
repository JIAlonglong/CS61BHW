package hw0b;

public class Dessert {
    private int style,price;
    public static int num = 0;
    public Dessert(int s, int p){
        this.price=p;
        this.style=s;
        num++;
    }

    public void printDessert(){
        System.out.println(style+""+price+""+num);
    }

    public static void main(String [] args){
        Dessert a =new Dessert(1,2);
        a.printDessert();
    }

}
