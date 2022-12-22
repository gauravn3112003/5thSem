// Write a program to create a Jtree.

import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class Practical7 {  
JFrame f;  
Practical7(){  
    f=new JFrame();   
    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
    DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
    style.add(color);  
    
    style.add(font);  
    DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
    DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
    DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
    color.add(red); color.add(blue); color.add(black); color.add(green);      
    style.add(red);  
    JTree jt=new JTree(style);  
    f.add(jt);  
    f.setSize(500,500);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new Practical7();  
}}  