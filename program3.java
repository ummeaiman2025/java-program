
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        Calculator obj = new Calculator();

        System.out.println("Sum of two numbers: " + obj.add(10, 20));
        System.out.println("Sum of three numbers: " + obj.add(10, 20, 30));
        System.out.println("Sum of decimal numbers: " + obj.add(5.5, 4.5));
    }
}
