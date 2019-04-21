package self;

public class Operators {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " +result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
    }
}