import java.io.FileNotFoundException;

public class mist_code2 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc [3] = 9;
        }catch (NullPointerException ex){
            System.out.println("Null не является указателем.");
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы размера");
        }catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException{
        System.out.println(a + b);
    }
}
