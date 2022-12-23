// Write a program using swing to display a Scrollpane and JcomboBox in an Japplet  with the items-English,Marathi,Hindi,Sanskrit.

import javax.swing.*;

public class Practical6 {
    JFrame f;

    Practical6() {
        f = new JFrame("ComboBox Example");
        String country[] = { "India", "Aus", "U.S.A", "England", "Newzealand" };
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Practical6();
    }
}