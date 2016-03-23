import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Kristian on 3/23/2016.
 */
public class P07RandomizeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        if (n == m) {
            System.out.println(m);
        }
        else {
            ArrayList <Integer> num = new ArrayList<Integer>();
            for (int i = Math.min(n,m); i <= Math.max(n,m); i++) {
                num.add(i);
            }
            Collections.shuffle(num);
            System.out.println(num);
        }
    }
}
