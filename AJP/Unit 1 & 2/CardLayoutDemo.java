import java.awt.*;

public class CardLayoutDemo extends Frame {
    CardLayout card = new CardLayout(30,30);

    CardLayoutDemo() {
        setLayout(card);
        setTitle("CardLAyout Demo");
        setVisible(true);
        setSize(220, 150);

        Button btn1 = new Button("First");
        add(btn1);

        Button btn2 = new Button("second");
        add(btn2);

        Button btn3 = new Button("Third");
        add(btn3);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
