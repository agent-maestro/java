public class Playground {
    public static void main(String[] args) {
       System.out.println(isEven(8));

       System.out.println(areaOfRectangle(4, 7));

       System.out.println(Calculator.add(10, 5));
       System.out.println(Calculator.subtract(10, 5));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int areaOfRectangle (int number1, int number2) {
        return number1 * number2;
    }
}
