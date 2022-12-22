// Write a program to design simple calculator with use of GridLayout

import java.awt.*;

public class Practical3 extends Frame {
    Practical3() {
        Panel f = new Panel();
        add(f);
        f.setBackground(Color.BLUE);
        Label cals = new Label("CALCULATOR");
        add(cals);
        cals.setBounds(110, 40, 85, 25);
        cals.setBackground(Color.CYAN);
        Button b, b1;
        f.add(b1 = new Button("AC"));
        f.add(b1 = new Button("X"));
        f.add(b1 = new Button("%"));
        f.add(b1 = new Button("/"));
        for (int i = 9; i > 6; i--) {
            String a = Integer.toString(i);
            b = new Button(a);
            f.add(b);
        }
        f.add(b = new Button("*"));
        for (int i = 6; i > 3; i--) {
            String a = Integer.toString(i);
            b = new Button(a);
            f.add(b);
        }
        f.add(b = new Button("-"));
        for (int i = 3; i > 0; i--) {
            String a = Integer.toString(i);
            b = new Button(a);
            f.add(b);
        }
        f.add(b = new Button("+"));
        f.add(b = new Button("."));
        f.add(b = new Button("0"));
        f.add(b = new Button("^"));
        b1 = new Button("=");
        f.add(b1);
        // f.add(b=new Button(""))
        // b1.setBounds(85,500,80,100);
        f.setLayout(new GridLayout(5, 4, 5, 5));
        setLayout(null);
        f.setBounds(0, 200, 300, 300);
        setSize(310, 510);
        f.setVisible(true);
        setVisible(true);
        setBackground(Color.CYAN);
        setTitle("Calculator using grid Layout");
        TextArea te = new TextArea("");
        te.setBounds(13, 90, 280, 100);
        add(te);
    }

    public static void main(String args[]) {
        new Practical3();
    }
}