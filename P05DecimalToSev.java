import com.sun.javafx.scene.layout.region.Margins;


import java.util.Scanner;

/**
 * Created by Kristian on 3/23/2016.
 */
public class P05DecimalToSev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dec = input.nextInt();

        String sev = Integer.toString(dec,7);
        System.out.println(sev);
    }
}
