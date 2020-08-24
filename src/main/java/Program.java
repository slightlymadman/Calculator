import Calculator.Context;

import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import Calculator.Box;

public class Program extends JFrame {
    private JPanel panel;
    private final int COLS = 4;
    private final int ROWS = 5;
    private final int imageSize = 50;

    public static void main(String[] args) throws IOException {

        new Program();

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

    private Program() {
        setImages();
        initPanel();
        initFrame();
    }
    private void initPanel(){
        panel = new JPanel(){
            @Override
            protected void paintComponent (Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("multiply"),0,0, this);
                g.drawImage(getImage("num1"),imageSize,0, this);
            }
        };
        panel.setPreferredSize (new Dimension(COLS*imageSize, ROWS*imageSize));
        add (panel);
    }

    private void initFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calaulator");
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    private void setImages () {
        for (Box box : Box.values())
            box.image = getImage(box.name());
    }

    private Image getImage (String name) {
        String fileName = "img/" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(fileName));
        return icon.getImage();
    }
}
