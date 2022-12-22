import java.awt.*;




// flowlayout 
class flowLayout extends Frame {
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

        setTitle("FlowLayout Demo");
        setSize(280, 150);
        setVisible(true);
    }
}


public class FlowLayoutDemo {
    public static void main(String[] args) {

        // FlowLayout Example 
        flowLayout f = new flowLayout();

        // File Dialog Example
        FileDialog f1 = new FileDialog(f, "File Dialog");
        f1.setVisible(true);

        
    }
}