import Calculator.Context;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Integer Calculator!");
        Context calc = new Context();
        while (true) {
            char key = (char) System.in.read();
            if (key >= ' ') {
                calc.press(key);
                System.out.println(calc);
            }
        }



    }
}
