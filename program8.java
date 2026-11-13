
class Stack<T> {
    int top = -1;
    T[] arr;

    @SuppressWarnings("unchecked")
    Stack(int size) {
        arr = (T[]) new Object[size];
    }

    void push(T value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top--] + " popped");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

class GenericStack {
    public static void main(String[] args) {
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        Stack<Integer> s = new Stack<>(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.display();
    }
}
