
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

class CustomException {
    public static void main(String[] args) {
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        int age = 16;

        try {
            if (age < 18) {
                throw new AgeException("Age must be 18 or above");
            }

            System.out.println("Eligible to vote");
        }
        catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}
