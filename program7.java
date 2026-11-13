
interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {
    public void showFather() {
        System.out.println("Father's qualities");
    }

    public void showMother() {
        System.out.println("Mother's qualities");
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        Child c = new Child();

        c.showFather();
        c.showMother();

        System.out.println("Multiple inheritance using interfaces");
    }
}
