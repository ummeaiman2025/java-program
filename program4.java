
class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program completed successfully");
    }
}
