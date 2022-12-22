// Write a program to design a form using the component List and Choice.

import java.awt.*;
public class Practical2 extends Frame {
Practical2(){
Label name ,batch,sub;
TextField tname;
Choice C_batch;
List L_sub;
Button Submit;
Panel p = new Panel();
add(p);
p.setLayout(null);
p.setBounds(25,50,400,450);
p.setBackground(Color.LIGHT_GRAY);
//name of the student 
p.add(name = new Label("Name: "));
name.setBounds(40,100,50,30);
p.add(tname = new TextField());
tname.setBounds(140,100,150,25);
// creating a batch Label
p.add(batch = new Label("Select Batch:"));
batch.setBounds(40,140,100,25);
// batch.setBackground(Color.BLUE);
// creating a choice for batch
p.add(C_batch = new Choice());
C_batch.add("Batch CO-1");
C_batch.add("Batch CO-2");
C_batch.add("Batch CO-3");
C_batch.setBounds(140,140,100,25);
// creating a list 
p.add(sub = new Label(" Select Practical: "));
sub.setBounds(40,220,100,25);
p.add( L_sub = new List(1,false));
L_sub.add("Advanced java");
L_sub.add("Operating System");
L_sub.add("Client side scripting");
L_sub.add("Software Testing");
L_sub.add("Environmental Studies");
L_sub.setBounds(140,220,200,100);
//Creating a submit Button
p.add(Submit = new Button("Submit"));
Submit.setBounds(160,370,100,25);
Submit.setBackground(Color.BLACK);
Submit.setForeground(Color.WHITE);
setLayout(null);
setTitle("Practical no 2");
setVisible(true);
setSize(450,550);
}
public static void main(String args[]) {
new Practical2();
}
}
