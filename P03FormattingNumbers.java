import com.sun.javafx.scene.control.skin.IntegerFieldSkin;
import com.sun.javafx.scene.layout.region.Margins;

import java.util.Scanner;

/**
 * Created by Kristian on 22.3.2016 г..
 */
public class P03FormattingNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //String hex = Integer.toHexString(a).toUpperCase();
        String bin = Integer.toString(a,2);



        System.out.printf("|%-10X|%10s|%10.2f|%-10.3f|",a,bin,b,c);
    }
}
