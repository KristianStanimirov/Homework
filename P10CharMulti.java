import java.util.Scanner;

/**
 * Created by Kristian on 3/23/2016.
 */
public class P10CharMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.next();
        String second = input.next();
        System.out.println(multiChar(first,second));
    }

    static int multiChar(String first,String second) {
        int ch = 0;
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                ch += first.charAt(i) * second.charAt(i);
            }
        }else if (first.length()>second.length()) {
            for (int i = 0; i < second.length(); i++) {
                ch += first.charAt(i) * second.charAt(i);
            }
            for (int i = second.length(); i < first.length(); i++) {
                ch += first.charAt(i);
            }

        }else {
            for (int i = 0; i <first.length() ; i++) {
                ch+=first.charAt(i)*second.charAt(i);
            }
            for (int i = first.length(); i <second.length() ; i++) {
                ch+=second.charAt(i);
            }
        }
        return ch;
    }

}
