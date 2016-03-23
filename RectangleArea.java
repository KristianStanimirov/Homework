import java.util.Scanner;

/**
 * Created by Kristian on 22.3.2016 г..
 */
public class RectangleArea {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int area = a*b;
        System.out.println(area);
    }
}
