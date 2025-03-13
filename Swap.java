public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        a = a + b; // a now becomes 11
        b = a - b; // b becomes 5 (original value of a)
        a = a - b; // a becomes 6 (original value of b)

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
