package ClassNote.lesson1;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 1;
        int b = 2;
        // prefix > right hand operand > assign the value to the left > postfix
        int c =  ++a + b++;
        System.out.println(c);
    }
}
