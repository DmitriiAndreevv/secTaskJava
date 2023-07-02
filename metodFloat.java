import java.util.InputMismatchException;
import java.util.Scanner;

public class metodFloat {

    public static void main(String[] args) {
        Flooat();
    }

    private static float Flooat() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите дробное число (тип: float): ");
            String input = scanner.nextLine();
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {

            if (true) {
                System.out.println("Вы ввели: " + Flooat());
            }
            if (false) {
                System.out.println("Некорректный ввод");
            }

        }
        scanner.close();
        return 0;
    }
}
