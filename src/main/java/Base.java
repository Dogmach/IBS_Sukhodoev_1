import java.util.*;

/**
 * Created by Nikita Sukhodoev on 08.04.2024
 * @author Nikita Sukhodoev
 * @see #sumMethod(double, double)
 */

public class Base {

    public void sumMethod(double a, double b) {
        double c = a + b;
        System.out.printf("Сумма двух чисел равна: %.4f", c);
    }

    public static void main(String[] args) {
        Base base = new Base();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два дробных числа по очереди: ");
        base.sumMethod(scanner.nextDouble(), scanner.nextDouble());
    }
}