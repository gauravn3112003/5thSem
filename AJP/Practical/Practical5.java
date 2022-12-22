
// Write a program using AWT to create a meneubar where menubar contain menu  items such as File,Edit,View and create a submenu under the File menu: New and  Open.

import java.awt.*;
import java.awt.event.*;

// import java.awt.event.*;
public class Practical5 extends Frame implements ActionListener {
    Practical5() {
        MenuBar m = new MenuBar();
        setMenuBar(m);
        setTitle("Practical 5");
        setSize(600, 400);
        setVisible(true);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("View");
        Menu m4 = new Menu("Exit");
        Label l1 = new Label("Garav");
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        m4.addActionListener(this);
        MenuItem i1 = new MenuItem("New");
        MenuItem i2 = new MenuItem("Open");

        m1.add(i1);
        m1.addSeparator();
        m1.add(i2);
    }

    public void actionPerformed(ActionEvent e) {
        Label l1 = new Label("Garav");
        // l1.setBounds(500, 100);
        Frame f = new Frame("New Frame");
        f.add(l1);
        f.setVisible(true);
        f.setSize(500, 400);

    }

    public static void main(String args[]) {
        new Practical5();
    }
}
