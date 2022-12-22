// Write a program to create a two – level card deck that allows the user to select  component of panel using CardLayout.

import java.awt.*;
import java.awt.event.*;

class CardLayoutExample extends Frame implements ActionListener {
    CardLayout card = new CardLayout(20, 20);
    CardLayoutExample() {
        setLayout(card);
        Button Btnfirst = new Button("first ");
        Button BtnSecond = new Button("Second");
        Button BtnThird = new Button("Third");
        add(Btnfirst, "Card1");
        add(BtnSecond, "Card2");
        add(BtnThird, "Card3");
        Btnfirst.addActionListener(this);
        BtnSecond.addActionListener(this);
        BtnThird.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        card.next(this);
    }
}

class Practical4 {
    public static void main(String args[]) {
        CardLayoutExample frame = new CardLayoutExample();
        frame.setTitle("CardLayout in Java Example");
        frame.setSize(450, 400);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
