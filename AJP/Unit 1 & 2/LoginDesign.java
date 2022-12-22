import java.awt.*;

class LoginDesign extends Frame {

    private Button ok, cancel;
    Choice ch;

    LoginDesign(String s) {
        super(s);
        setVisible(true);

        // To Add menu BAr
        MenuBar mBar = new MenuBar();
        setMenuBar(mBar);

        Menu file = new Menu("Home");
        mBar.add(file);

        Menu Dashboard = new Menu("Dashboard");
        mBar.add(Dashboard);
        Dashboard.add(new MenuItem("All Users"));
        Dashboard.add(new MenuItem("All Blogs"));
        Dashboard.add(new MenuItem("Analytics"));
        Dashboard.add(new MenuItem("LogOut"));

        Menu Login = new Menu("Login");
        mBar.add(Login);

        setSize(400, 300);
        Label userName = new Label("Username : ");
        Label password = new Label("Password : ");
        TextField user = new TextField(20);
        TextField pass = new TextField(20);
        Label role = new Label("I'm :");
        Choice selectRole = new Choice();

        userName.setBounds(50, 70, 100, 10);
        user.setBounds(150, 62, 180, 30);

        password.setBounds(50, 120, 100, 10);
        pass.setBounds(150, 112, 180, 30);
        pass.setEchoChar('*');

        role.setBounds(50, 170, 100, 10);
        selectRole.setBounds(150, 142, 100, 30);
        selectRole.add("User");
        selectRole.add("Admin");

        add(userName);
        add(user);
        add(password);
        add(pass);
        add(role);
        add(selectRole);

        cancel = new Button("Cancel");
        ok = new Button("OK");
        cancel.setBounds(100, 250, 100, 30);
        ok.setBounds(290, 250, 50, 30);
        add(cancel);
        add(ok);

    }

    public static void main(String[] args) {
        new LoginDesign("Login Form");
    }
}