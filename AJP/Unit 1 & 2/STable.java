import javax.swing.*;
public class STable {
    STable() {
        JFrame f = new JFrame();
        String rows[][] = {
                { "101", "Gaurav ", "1000000" },
                { "101", "Yash ", "900000" },
                { "101", "Om ", "800000" },
                { "101", "Vijay ", "700000" },
                { "101", "Tanmay ", "600000" }
        };
        String columns[] = { "ID", "NAME", "SALARY" };
        JTable jt = new JTable(rows,columns);
        jt.setBounds(0,0,200,300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new STable();
    }

}