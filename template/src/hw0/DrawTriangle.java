package hw0;

public class DrawTriangle {
    public static void drawTriangle(int rows){
        for (int i = 1;i<=rows;i++)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

