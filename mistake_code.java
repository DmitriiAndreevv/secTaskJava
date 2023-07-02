public class mistake_code {
    public static void main(String[] args) {
        correct();
    }
    public static void correct(){
        try {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int a = 0;
            double catchRes = arr[9] / a;
            System.out.println("catchRes = " + catchRes);
        }catch (ArithmeticException e){
            System.out.println("catching exception" + e);
        }
    }
}
