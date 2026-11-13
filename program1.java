
class JavaConstructs {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("==============================");

        int a = 10, b = 20;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));

        if (a > b)
            System.out.println("A is greater");
        else
            System.out.println("B is greater");

        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
