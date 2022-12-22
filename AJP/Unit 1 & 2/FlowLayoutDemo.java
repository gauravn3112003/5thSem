import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// flowlayout 
class flowLayout extends Frame {
    String msg = "";

    flowLayout() {
        setLayout(new FlowLayout());
        Button btn1 = new Button("Gauarv");
        add(btn1);
        btn1.setBackground(Color.RED);
        btn1.setForeground(Color.WHITE);

        Button btn2 = new Button("OM");
        add(btn2);
        btn2.setBackground(Color.RED);
        btn2.setForeground(Color.WHITE);

        msg = "Hey Gaurav I Google Assistence";

        Label message = new Label("Hey Gaurav");
        message.setBounds(10,100,100,50);
        btn2.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Hey Gaurav");
                message.setBounds(150, 100, 180, 30);
                   message.setText(msg);
            }
        });

        add(message);
        setTitle("FlowLayout Demo");
        setSize(500, 500);
        setVisible(true);
    }
}

public class FlowLayoutDemo extends Frame {
    public static void main(String[] args) {

        // FlowLayout Example
        new flowLayout();

        // FlowLayoutDemo f1 = new FlowLayoutDemo();
        // Button b1 = new Button("Gaurav");
        // b1.addActionListener((ActionListener) new ActionListener() {
        // public void actionPerformed(ActionEvent event) {
        // System.out.println("Hey Sir");
        // }
        // });

        // f1.add(b1);
        // f1.pack();
        // f1.setVisible(true);

    }
}