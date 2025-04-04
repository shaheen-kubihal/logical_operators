public class javapgrm {
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
        System.out.println("Substraction : " + sub);

    }

}

public static void main(String[] args) {
    javapgrm obj = new javapgrm();
    obj.calculation();

}
