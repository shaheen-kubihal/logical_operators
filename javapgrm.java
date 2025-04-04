public class Javapgrm {
    int a;
    int b;

    void calculation() {
        a = 10;
        b = 20;
        int add = a + b;
        System.out.println("Addition : " + add);
    }

    void calculation(int a, int b) {
        this.a = a;
        this.b = b;
        int sub = a - b;
        System.out.println("Subtraction : " + sub);
    }

    void calculation(int a, int b, int option) {
        this.a = a;
        this.b = b;
        if (option == 1) {
            int mul = a * b;
            System.out.println("Multiplication : " + mul);
        } else if (option == 2) {
            int div = a / b;
            System.out.println("Division : " + div);
        }
    }

    public static void main(String[] args) {
        Javapgrm obj = new Javapgrm();
        obj.calculation();
        obj.calculation(10, 20);
        obj.calculation(5, 4, 1);
        obj.calculation(20, 5, 2);
    }
}
