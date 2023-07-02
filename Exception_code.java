import java.util.Scanner;

public class Exception_code {
    public static void main(String[] args) {
        exe();
    }

    public static String exe() {
        System.out.print("Введите текст: ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        if (string.isEmpty())
            throw new IllegalArgumentException("Пустые строки нельзя вводить");
        else
            System.out.println(string);
        return string;
    }
}
