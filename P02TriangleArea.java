import java.util.Scanner;

/**
 * Created by Kristian on 22.3.2016 г..
 */
public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a1=input.nextInt();
        int a2=input.nextInt();
        int b1=input.nextInt();
        int b2=input.nextInt();
        int c1=input.nextInt();
        int c2=input.nextInt();

        int area =Math.abs((a1*(b2-c2)+b1*(c2-a2)+c1*(a2-b2)))/2;
        if (area ==0) {
        System.out.println(0);
        }
        else {
            System.out.println(area);
        }




    }
}
