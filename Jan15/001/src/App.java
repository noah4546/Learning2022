public class App {

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.addTwoNumbers(10, 20));
    }

}

/*
public class App {

    public static void main(String[] args) throws Exception {

        double result = divideTwoNumbers(100, 0);
        System.out.println(result);
        
    }

    private static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    private static double divideTwoNumbers(int dividend, int divisor) throws IllegalArgumentException {
        if (divisor == 0) throw new IllegalArgumentException("Can't divide by 0");

        return dividend / divisor;
    }

    /**
     * Public - visible anywhere
     * Private - Only the inside of the file can read
     * Protected - Only inside the folder can read it
     */
/*
}*/
