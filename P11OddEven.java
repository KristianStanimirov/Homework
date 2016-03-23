import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kristian on 3/23/2016.
 */
public class P11OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            num.add(Integer.parseInt(input[i]));

        }
        String[] secondInput = scan.nextLine().split(" ");
        int numGet = Integer.parseInt(secondInput[1]);
        String evenOrOddToGet = secondInput[2];

        findingEvenOrOdd(num, numGet, evenOrOddToGet);


    }

    static int findingEvenOrOdd(List<Integer> num, int numGet, String evenOrOddToGet) {
        if (evenOrOddToGet.equals("even")) {
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) % 2 == 0) {
                    System.out.print(num.get(i) + " ");
                    numGet--;
                    if (numGet == 0) {
                        System.exit(0);
                    }

                }

            }
        } else {
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) % 2 != 0) {
                    System.out.print(num.get(i) + " ");
                    numGet--;
                    if (numGet == 0) {
                        System.exit(0);
                    }

                }
            }
        }
        return 1;
    }
}