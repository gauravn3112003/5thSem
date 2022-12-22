import java.awt.*;

public class GridLayoutDemo extends Frame {

    GridLayoutDemo() {
        GridLayout g1 = new GridLayout(1, 4, 10, 3);
        g1.setHgap(2);
        setLayout(g1);
        
        Button btn1 = new Button("Button 1");
        add(btn1);

        Button btn2 = new Button("Button 2");
        add(btn2);

        Button btn3 = new Button("Button 3");
        add(btn3);

        Button btn4 = new Button("Button 4");
        add(btn4);

        Button btn5 = new Button("Button 5");
        add(btn5);

        Button btn6 = new Button("Button 6");
        add(btn6);

        setTitle("GridLAyout Demo");
        setSize(280, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
