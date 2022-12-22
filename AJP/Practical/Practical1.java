// Write a program to demonstrate the use of AWT component like Lable,Textfield,TextArea,Button,Checkbox,RadioButton etc.


import java.awt.*;
//import java.awt.event.*;
public class Practical1 extends Frame {
    Practical1() {
        Label title, name, gender, adhar, address;
        CheckboxGroup c;
        TextField tname;
        Checkbox male, female, yes, no;
        TextArea t;
        Button submit, reset;
        Panel p = new Panel();
        add(p);
        p.setBounds(40, 20, 400, 600);
        p.setBackground(Color.GRAY);
        p.setLayout(null);
        title = new Label("STUDENT INFORMATION");
        p.add(title);
        title.setBounds(120, 30, 150, 25);
        title.setBackground(Color.CYAN);
        name = new Label("Name");
        p.add(name);
        name.setBounds(40, 100, 50, 30);
        // name.setBackground(Color.BLUE);
        // textbox for name
        tname = new TextField();
        p.add(tname);
        tname.setBounds(90, 100, 150, 25);
        p.add(gender = new Label("Gender"));
        gender.setBounds(40, 135, 50, 25);
        // gender male feamle
        c = new CheckboxGroup();
        p.add(male = new Checkbox("Male", false, c));
        male.setBounds(90, 160, 50, 25);
        p.add(female = new Checkbox("Female", false, c));
        female.setBounds(150, 160, 70, 25);
        // adhar is available or not
        p.add(adhar = new Label("Aadhar"));
        adhar.setBounds(40, 195, 70, 25);
        p.add(yes = new Checkbox("Yes", false));
        yes.setBounds(90, 220, 50, 25);
        p.add(no = new Checkbox("No", false));
        no.setBounds(150, 220, 70, 25);
        // Address
        p.add(address = new Label("Enter Address"));
        address.setBounds(40, 250, 80, 25);
        p.add(t = new TextArea(40, 40));
        t.setBounds(70, 280, 200, 70);
        // Creating Button
        p.add(reset = new Button("RESET"));
        reset.setBounds(120, 380, 50, 25);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        p.add(submit = new Button("SUBMIT"));
        submit.setBounds(200, 380, 50, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        setTitle("Student Information");
        setLayout(null);
        setSize(500, 800);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Practical1();
    }
}