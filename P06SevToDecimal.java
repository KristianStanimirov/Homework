


import java.util.Scanner;

/**
 * Created by Kristian on 3/23/2016.
 */
public class P06SevToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sev = input.next();
        int dec = Integer.valueOf(sev,7);

        System.out.println(dec);


    }
}
