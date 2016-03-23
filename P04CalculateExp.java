import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 * Created by Kristian on 22.3.2016 г..
 */
public class P04CalculateExp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double firstFormula = Math.pow (((a*a+b*b)/(a*a-b*b)),(a+b+c)/(Math.sqrt(c)));
        double secondFormula = Math.pow((a*a+b*b-Math.pow(c,3)),(a-b));
        double averageOne = (a+b+c)/3;
        double averageTwo = (firstFormula+secondFormula)/2;
        double diffrence = Math.abs(averageOne-averageTwo);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",firstFormula,secondFormula,diffrence);
    }
}
